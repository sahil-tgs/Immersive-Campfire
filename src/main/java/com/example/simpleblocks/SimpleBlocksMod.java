package com.example.simpleblocks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleBlocksMod implements ModInitializer {
    public static final String MOD_ID = "campfire_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Campfire Overhaul Mod!");
        
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModItemGroups.registerItemGroups();
        
        LOGGER.info("Campfire Overhaul Mod initialized successfully!");
    }
}
