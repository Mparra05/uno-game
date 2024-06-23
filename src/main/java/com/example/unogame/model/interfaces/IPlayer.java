package com.example.unogame.model.interfaces;

import com.example.unogame.model.Card;

import java.util.ArrayList;

public interface IPlayer {

    void setPlayerCards(ArrayList<Card> playerCards);
    ArrayList<Card> getPlayerCards();
    String getPlayerType();
    boolean canClickUno(int playerCards, int botCards);

}
