package dev.dhyces.dweller.registry;

import dev.dhyces.dweller.Dweller;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks REGISTER = DeferredRegister.createBlocks(Dweller.MODID);

    public static final DeferredBlock<Block> WELL = REGISTER.registerSimpleBlock("well", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> WELL_TEST = REGISTER.registerSimpleBlock("well_supports", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> WELL_TEST2 = REGISTER.registerSimpleBlock("well_roof", BlockBehaviour.Properties.of());
}
