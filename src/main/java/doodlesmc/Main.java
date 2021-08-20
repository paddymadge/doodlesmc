package doodlesmc;

import doodlesmc.commands.*;
import doodlesmc.recipes.*;
//import doodlesmc.events.*;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("invsee").setExecutor(new invseecommand());
        getCommand("echestsee").setExecutor(new echestseecommand());
        getCommand("afk").setExecutor(new afkcommand());
        getCommand("sd").setExecutor(new sdcommand());
        getCommand("disableplugin").setExecutor(new disableplugincommand(this));
        getCommand("color").setExecutor(new colorcommand());
        getCommand("teamchangecommand").setExecutor(new teamchangecommand());


        calciterecipe calcite = new calciterecipe(this);
        sporeblossomrecipe sporeblossom = new sporeblossomrecipe(this);

        getLogger().info("[DoodlesMC] DoodlesMC plugin has been enabled!");
    }
    public void onDisable(){
        getLogger().info("[DoodlesMC] DoodlesMC plugin has been disabled!");
    }
}
