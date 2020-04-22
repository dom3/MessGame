package net.domdev.messgame;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.awt.desktop.OpenURIEvent;
import java.util.ArrayList;

public class MessFunctionality {

    //-----------------------------------------------------------------

    public static boolean gameIsRunning = false;

    private static ArrayList<Location> entityLocations = new ArrayList<>();
    private static ArrayList<Location> spawnLocations = new ArrayList<>();

    //-----------------------------------------------------------------

    public static ArrayList<Location> getEntityLocations()
    {
        return entityLocations;
    }

    public static ArrayList<Location> getSpawnLocations() {
        return spawnLocations;
    }

    //-----------------------------------------------------------------

    public static boolean isRunning()
    {
        return gameIsRunning;
    }

    public static void setGameRunning(boolean value)
    {
        gameIsRunning = value;
    }

    //-----------------------------------------------------------------

    public static void runLoop() {

        setGameRunning(true);

        if (gameIsRunning) {
            Bukkit.getScheduler().scheduleSyncRepeatingTask(MessGame.getPlugin(MessGame.class), new Runnable() {
                @Override
                public void run() {

                }
            }, 1, 10);
        }
    }

    public static void endLoop()
    {
        setGameRunning(false);
    }

}
