package dev.dhyces.dweller.registry;

import dev.dhyces.dweller.Dweller;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems(Dweller.MODID);

    public static final DeferredItem<BlockItem> WELL = REGISTER.registerSimpleBlockItem(BlockRegistry.WELL);
    public static final DeferredItem<BlockItem> WELL_TEST = REGISTER.registerSimpleBlockItem(BlockRegistry.WELL_TEST);
    public static final DeferredItem<BlockItem> WELL_TEST2 = REGISTER.registerSimpleBlockItem(BlockRegistry.WELL_TEST2);
}
