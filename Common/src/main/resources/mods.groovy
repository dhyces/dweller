import modsdotgroovy.Dependency

ModsDotGroovy.make {
    def modid = this.buildProperties["mod_id"]

    modLoader = "javafml"
    loaderVersion = "[1,)"

    license = "MIT"
    issueTrackerUrl = ""

    mod {
        modId = modid
        displayName = this.buildProperties["mod_name"]
        version = this.version
        group = this.group
        authors = [this.buildProperties["authors"] as String]

        displayUrl = ""
        sourcesUrl = ""
        logoFile = "logo.png"
        description = ""

        onFabricAndQuilt {
            entrypoints {
                main = ""
                client = ""
            }
        }

        onQuilt {
            intermediateMappings = "net.fabricmc:intermediary"
        }

        dependencies {
            onForge {
                minecraft = this.minecraftVersionRange
                forge = ">=${this.libs.versions.neoforge}"
            }

            onFabric {
                minecraft = this.minecraftVersion
                fabricloader = ">=${this.fabricLoaderVersion}"
                mod('fabric-api') {
                    versionRange = ">=${this.libs.versions.fabric.api.split("+")[0]}"
                }
            }

            onQuilt {
                minecraft = this.minecraftVersion
                quilt_loader = ">=${this.quiltLoaderVersion}"
                quilted_fabric_api = ">=${this.buildProperties["quilted_fabric_version"]}"
                quilt_base = ">=${this.buildProperties["qsl_version"]}"
            }
        }

        dependencies = dependencies.collect { dep ->
            new Dependency() {
                @Override
                Map asForgeMap() {
                    def map = dep.asForgeMap()
                    def mandatory = map.mandatory
                    map.remove('mandatory')
                    map.put('type', mandatory ? 'required' : 'optional')
                    return map
                }
            }
        }
    }

    onFabricAndQuilt {
        environment = "*"
        mixin = [
                modid + ".mixins.json"
        ]
    }
}