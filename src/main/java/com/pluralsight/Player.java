package com.pluralsight;

import javax.swing.*;

public class Player {

    private String playerName;
    private Hand playerHand;

    public Player(){

    }
    public Player(Hand hand, String playerName) {
        this.playerName = playerName;
        this.playerHand = hand;
    }

    public static String names(String name){
        return name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

}
