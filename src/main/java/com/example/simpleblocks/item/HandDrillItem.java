package com.example.simpleblocks.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Hand Drill - A primitive fire-starting tool.
 * Crafted from 1 plank + 1 stick.
 * Used to start fires on unlit campfires with ~15% success rate.
 * Has durability - breaks after multiple uses.
 */
public class HandDrillItem extends Item {
    
    // Hand drill has 32 durability (roughly 32 attempts before breaking)
    // At 15% success rate, expected ~5 successful fires per hand drill
    public static final int MAX_DURABILITY = 32;
    
    public HandDrillItem(Settings settings) {
        super(settings.maxDamage(MAX_DURABILITY));
    }
    
    @Override
    public boolean isEnchantable(ItemStack stack) {
        // Hand drill cannot be enchanted - it's a primitive tool
        return false;
    }
    
    @Override
    public int getEnchantability() {
        return 0;
    }
}

