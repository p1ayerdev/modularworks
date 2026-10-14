package com.p1ayer.modularblocks;

import com.p1ayer.modularworks.ModularWorks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModularBlocks {

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.IRON)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK,
                Identifier.fromNamespaceAndPath(ModularWorks.MOD_ID, name))));

        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ModularWorks.MOD_ID, name), toRegister);
    }

    public static void registerModBlocks() {
        ModularWorks.LOGGER.info("Registering Mod Blocks for "+ ModularWorks.MOD_ID);
    }

}

