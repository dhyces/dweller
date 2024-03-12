package dev.dhyces.dweller;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dweller {
    public static final Logger LOGGER = LoggerFactory.getLogger("Dweller");
    public static final String MODID = "dweller";
    public static ResourceLocation id(String id) {
        return new ResourceLocation(MODID, id);
    }
}
