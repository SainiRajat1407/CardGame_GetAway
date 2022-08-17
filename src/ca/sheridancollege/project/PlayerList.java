/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Tanveer
 */
public class PlayerList {
    private static ArrayList<Player> players = new ArrayList<>(); // keep track of players playing
    
    
    /**
     * This method adds
     * @param player object of player class
     */
    public static void addPlayer(Player player) {
        players.add(player);
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }
    
    
    
    
}
