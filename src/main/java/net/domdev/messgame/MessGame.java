package net.domdev.messgame;

import org.bukkit.plugin.java.JavaPlugin;

public class MessGame extends JavaPlugin {

    @Override
    public void onEnable() {
        // TODO: Finish startup logic
        MessFunctionality.runLoop();
    }

    @Override
    public void onDisable() {
        // TODO: Finish shutdown logic
        MessFunctionality.endLoop();
    }
}
