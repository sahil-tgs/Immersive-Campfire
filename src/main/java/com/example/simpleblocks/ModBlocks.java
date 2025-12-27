package com.example.simpleblocks;

import com.example.simpleblocks.block.FirewoodBlock;
import com.example.simpleblocks.block.StumpBlock;
import com.example.simpleblocks.block.UnlitCampfireBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    
    public static final Block STUMP = registerBlock("stump",
            new StumpBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(2.0f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)));
    
    public static final Block FIREWOOD_STACK = registerBlock("firewood_stack",
            new FirewoodBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(0.5f, 0.5f)
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()));
    
    public static final Block UNLIT_CAMPFIRE = registerBlock("unlit_campfire",
            new UnlitCampfireBlock(FabricBlockSettings.create()
                    .mapColor(MapColor.BROWN)
                    .strength(0.5f, 0.5f)
                    .sounds(BlockSoundGroup.WOOD)
                    .nonOpaque()));
    
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SimpleBlocksMod.MOD_ID, name), block);
    }
    
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(SimpleBlocksMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    
    public static void registerBlocks() {
        SimpleBlocksMod.LOGGER.info("Registering blocks for " + SimpleBlocksMod.MOD_ID);
    }
}
