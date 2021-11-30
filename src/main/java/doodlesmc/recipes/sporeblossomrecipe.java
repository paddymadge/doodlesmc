package doodlesmc.recipes;

import doodlesmc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

public class SporeblossomRecipe implements RecipeBuilder {

    private final Recipe recipe;

    public SporeblossomRecipe(Main plugin) {
        ItemStack sporeblossom = new ItemStack(Material.SPORE_BLOSSOM, 1);
        NamespacedKey nsKey = new NamespacedKey(plugin, "sporeblossom");
        ShapedRecipe recipe = new ShapedRecipe(nsKey, sporeblossom);

        recipe.shape(" D ", "DAD", " D ");
        recipe.setIngredient('D', Material.BIG_DRIPLEAF);
        recipe.setIngredient('A', Material.ALLIUM);
        this.recipe = recipe;
    }

    @Override
    public Recipe getRecipe() {
        return this.recipe;
    }
}
