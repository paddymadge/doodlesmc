package doodlesmc;

import doodlesmc.commands.*;
import doodlesmc.recipes.*;
//import doodlesmc.events.*;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("invsee").setExecutor(new InvSeeCommand());
        getCommand("echestsee").setExecutor(new EnderChestSeeCommand());
        getCommand("afk").setExecutor(new AfkCommand());
        getCommand("sd").setExecutor(new SdCommand());
        getCommand("disableplugin").setExecutor(new DisablePluginCommand(this));
        getCommand("color").setExecutor(new ColorCommand());
        getCommand("teamchangecommand").setExecutor(new TeamChangeCommand());
        getCommand("mem").setExecutor(new MemCommand());


        List<RecipeBuilder> recipes = new ArrayList<>();
        recipes.add(new CalciteRecipe(this));
        recipes.add(new SporeblossomRecipe(this));
        recipes.forEach(recipeBuilder -> this.getServer().addRecipe(recipeBuilder.getRecipe()));

        getLogger().info("[DoodlesMC] DoodlesMC plugin has been enabled!");
    }
    public void onDisable(){
        getLogger().info("[DoodlesMC] DoodlesMC plugin has been disabled!");
    }
}
