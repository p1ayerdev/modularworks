package com.p1ayer.datagen;

import com.p1ayer.modularblocks.ModularBlocks;
import com.p1ayer.modularitems.ModularItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModularBlocks.TITANIUM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModularItems.REINFORCED_HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModularItems.DIAMOND_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModularItems.TITANIUM_PICKAXE_HEAD, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModularItems.TOOL_HANDLE, ModelTemplates.FLAT_HANDHELD_ITEM);

    }
}
