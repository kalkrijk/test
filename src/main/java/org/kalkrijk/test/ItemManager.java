package org.kalkrijk.test;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack TestBucket;

    public static void init(){
        createTestBucket();
    }

    private static void createTestBucket(){
        ItemStack item = new ItemStack(Material.BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("§9Test Bucket");
        List <String> lore = new ArrayList<>();
        lore.add("§7This is a test item.");
        lore.add("Hopefully it exist when i arrive");
        meta.setMaxStackSize(1);
        meta.setLore(lore);
        item.setItemMeta(meta);
        TestBucket = item;

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(Test.plugin_main, "testbucket") ,TestBucket);
        recipe.shape("   ", "ili", "iii");
        recipe.setIngredient('i', Material.IRON_INGOT);
        recipe.setIngredient('l', Material.LAVA_BUCKET);

        Bukkit.addRecipe(recipe);
    }


}
