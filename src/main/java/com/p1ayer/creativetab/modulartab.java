package com.p1ayer.creativetab;

import com.p1ayer.modularblocks.ModularBlocks;
import com.p1ayer.modularitems.ModularItems;
import com.p1ayer.modularworks.ModularWorks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class modulartab {
    public static final CreativeModeTab MODULAR_WORKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ModularWorks.MOD_ID, "modularitems"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModularItems.REINFORCED_HANDLE))
                    .title(Component.translatable("creativemodetab.modularworks.modularworks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModularBlocks.TITANIUM_ORE);
                        output.accept(ModularItems.TOOL_HANDLE);
                        output.accept(ModularItems.REINFORCED_HANDLE);
                        output.accept(ModularItems.DIAMOND_PICKAXE_HEAD);
                        output.accept(ModularItems.TITANIUM_PICKAXE_HEAD);
                    }).build());


    public static void registerCreativeModeTabs() {
        ModularWorks.LOGGER.info("Registering Creative Mode Tabs for "+ ModularWorks.MOD_ID);
    }
}