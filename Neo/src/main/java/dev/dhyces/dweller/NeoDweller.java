package dev.dhyces.dweller;

import dev.dhyces.dweller.registry.BlockRegistry;
import dev.dhyces.dweller.registry.ItemRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(Dweller.MODID)
public class NeoDweller {
    public NeoDweller(IEventBus modBus, ModContainer container, Dist dist) {
        BlockRegistry.REGISTER.register(modBus);
        ItemRegistry.REGISTER.register(modBus);
    }
}
