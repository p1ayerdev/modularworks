package com.p1ayer.modularitems;

import com.p1ayer.modularworks.ModularWorks;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModularItems {

    public static Item REINFORCED_HANDLE = registerItem("reinforced_handle", Item::new);
    public static Item TOOL_HANDLE = registerItem("tool_handle", Item::new);
    public static Item DIAMOND_PICKAXE_HEAD = registerItem("diamond_pickaxe_head", Item::new);
    public static Item TITANIUM_PICKAXE_HEAD = registerItem("titanium_pickaxe_head", Item::new);

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ModularWorks.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ModularWorks.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ModularWorks.LOGGER.info("Registering Mod Items for " + ModularWorks.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(REINFORCED_HANDLE);
            output.accept(TOOL_HANDLE);
        });
    }
}
