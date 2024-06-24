package com.example.unogame.model.interfaces;

import com.example.unogame.model.Card;

import java.util.ArrayList;

public interface IPlayer {

    void setDefaultPlayerCards(ArrayList<Card> playerCards);
    void addCard(Card card);
    ArrayList<Card> getPlayerCards();
    String getPlayerType();
    boolean canClickUno(int playerCards, int botCards);
    void printCards();
    boolean playCard(String idPlayedCard, String lastPlayedCardValue, String lastPlayedCardColor);

}
