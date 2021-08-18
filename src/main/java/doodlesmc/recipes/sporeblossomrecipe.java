package doodlesmc.recipes;

import doodlesmc.Main;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class sporeblossomrecipe {

    public Main plugin;

    public sporeblossomrecipe(Main plugin) {
        this.plugin = plugin;
        sporeblossomRecipe1();
    }

    private void sporeblossomRecipe1() {
        ItemStack sporeblossom = new ItemStack(Material.SPORE_BLOSSOM, 1);
        NamespacedKey nsKey = new NamespacedKey(plugin, "sporeblossom");
        ShapedRecipe recipe = new ShapedRecipe(nsKey, sporeblossom);

        recipe.shape(" D ", "DAD", " D ");
        recipe.setIngredient('D', Material.BIG_DRIPLEAF);
        recipe.setIngredient('A', Material.ALLIUM);
        plugin.getServer().addRecipe(recipe);
    }
}
