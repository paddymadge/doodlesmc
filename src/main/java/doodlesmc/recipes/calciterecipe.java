package doodlesmc.recipes;

import doodlesmc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapelessRecipe;

public class CalciteRecipe implements RecipeBuilder {

    private final Recipe recipe;

    public CalciteRecipe(Main plugin) {
        ItemStack calcite = new ItemStack(Material.CALCITE, 2);
        NamespacedKey nsKey = new NamespacedKey(plugin, "calcite");
        ShapelessRecipe recipe = new ShapelessRecipe(nsKey, calcite);

        recipe.addIngredient(1, Material.BONE_BLOCK);
        recipe.addIngredient(1, Material.DIORITE);

        this.recipe = recipe;
    }

    @Override
    public Recipe getRecipe() {
        return recipe;
    }
}

