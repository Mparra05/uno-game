package com.example.unogame.model;

import com.example.unogame.model.interfaces.IPlayer;

import java.util.ArrayList;

public class Player implements IPlayer {

    private ArrayList<Card> playerCards;
    private final String playerType;

    public Player(String playerType) {
        this.playerCards = new ArrayList<Card>();
        this.playerType = playerType;
    }

    @Override
    public void setPlayerCards(ArrayList<Card> playerCards) {
        this.playerCards = playerCards;
    }

    @Override
    public ArrayList<Card> getPlayerCards() {
        return this. playerCards;
    }

    @Override
    public String getPlayerType() {
        return this.playerType;
    }

    @Override
    public boolean canClickUno(int playerCards, int botCards) {

        return (playerCards == 1 || botCards == 1);

    }
}
