package doodlesmc.recipes;

import doodlesmc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class calciterecipe {

    private Main plugin;

    public calciterecipe(Main plugin) {
        this.plugin = plugin;
        calciteRecipe0();
    }

    private void calciteRecipe0() {
        ItemStack calcite = new ItemStack(Material.CALCITE, 2);
        NamespacedKey nsKey = new NamespacedKey(this.plugin, "calcite");
        ShapelessRecipe recipe = new ShapelessRecipe(nsKey, calcite);

        recipe.addIngredient(1, Material.BONE_BLOCK);
        recipe.addIngredient(1, Material.DIORITE);

        this.plugin.getServer().addRecipe(recipe);
    }


}

