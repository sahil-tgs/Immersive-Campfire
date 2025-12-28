package com.example.simpleblocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {
    
    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(ModBlocks.STUMP);
            content.add(ModBlocks.FIREWOOD_STACK);
            content.add(ModBlocks.UNLIT_CAMPFIRE);
        });
        
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(ModItems.FIREWOOD);
        });
        
        // Hand Drill goes in Tools tab (it's a primitive fire-starting tool)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(ModItems.HAND_DRILL);
        });
        
        SimpleBlocksMod.LOGGER.info("Registered item groups for " + SimpleBlocksMod.MOD_ID);
    }
}
