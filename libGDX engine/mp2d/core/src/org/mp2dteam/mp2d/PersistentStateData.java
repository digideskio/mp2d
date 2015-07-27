package org.mp2dteam.mp2d;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 7/26/2015.
 */
public class PersistentStateData {

    public enum PowerupsEnum { }

    public enum LogbookEntiresEnum { }

    public enum BossesEnum { }

    /*
     * Instance variables
     */
    private String playerName;

    private int playerCurrentEnergy;
    private int playerMaxEnergy;
    private int playerCurrentMissiles;
    private int playerMaxMissiles;
    private List<Boolean> powerupsCollected;

    private List<Boolean> persistentLogbookEntriesSeen;
    private List<Boolean> bossesDefeated;

    /*
     * Constructor
     */
    public PersistentStateData()
    {
        playerName = "";
        playerCurrentEnergy = 99;
        playerMaxEnergy = 99;
        playerCurrentMissiles = 0;
        playerMaxMissiles = 0;
        powerupsCollected = new ArrayList<Boolean>();
        persistentLogbookEntriesSeen = new ArrayList<Boolean>();
        bossesDefeated = new ArrayList<Boolean>();
    }

    /*
     * Setters
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerCurrentEnergy(int playerCurrentEnergy) {
        this.playerCurrentEnergy = playerCurrentEnergy;
    }

    public void setPlayerMaxEnergy(int playerMaxEnergy) {
        this.playerMaxEnergy = playerMaxEnergy;
    }

    public void setPlayerCurrentMissiles(int playerCurrentMissiles) {
        this.playerCurrentMissiles = playerCurrentMissiles;
    }

    public void setPlayerMaxMissiles(int playerMaxMissiles) {
        this.playerMaxMissiles = playerMaxMissiles;
    }

    public void setPowerupsCollected(List<Boolean> powerupsCollected) {
        this.powerupsCollected = powerupsCollected;
    }

    public void setPersistentLogbookEntriesSeen(List<Boolean> persistentLogbookEntriesSeen) {
        this.persistentLogbookEntriesSeen = persistentLogbookEntriesSeen;
    }

    public void setBossesDefeated(List<Boolean> bossesDefeated) {
        this.bossesDefeated = bossesDefeated;
    }

    /*
     * Getters
     */
    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerCurrentEnergy() {
        return playerCurrentEnergy;
    }

    public int getPlayerMaxEnergy() {
        return playerMaxEnergy;
    }

    public int getPlayerCurrentMissiles() {
        return playerCurrentMissiles;
    }

    public int getPlayerMaxMissiles() {
        return playerMaxMissiles;
    }

    public List<Boolean> getPowerupsCollected() {
        return powerupsCollected;
    }

    public List<Boolean> getPersistentLogbookEntriesSeen() {
        return persistentLogbookEntriesSeen;
    }

    public List<Boolean> getBossesDefeated() {
        return bossesDefeated;
    }
}
