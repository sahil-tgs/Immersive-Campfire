package com.example.simpleblocks;

import com.example.simpleblocks.item.FirewoodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item FIREWOOD = registerItem("firewood",
            new FirewoodItem(new FabricItemSettings()));
    
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleBlocksMod.MOD_ID, name), item);
    }
    
    public static void registerItems() {
        SimpleBlocksMod.LOGGER.info("Registering items for " + SimpleBlocksMod.MOD_ID);
        
        // Register firewood as a fuel source (200 ticks = 10 seconds, smelts 1 item)
        // For reference: sticks = 100 ticks, planks = 300 ticks
        FuelRegistry.INSTANCE.add(FIREWOOD, 200);
    }
}
