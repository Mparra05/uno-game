package com.example.unogame.model;

import com.example.unogame.model.interfaces.IPlayer;
import javafx.scene.image.Image;

import java.util.ArrayList;

public class Player implements IPlayer {

    private ArrayList<Card> playerCards;
    private final String playerType;

    public Player(String playerType) {
        this.playerCards = new ArrayList<Card>();
        this.playerType = playerType;
    }

    @Override
    public void setDefaultPlayerCards(ArrayList<Card> playerCards) {

        for (int i = 0; i < 5; i++) {
            int randomCard = (int) (Math.random() * playerCards.size());
            this.playerCards.add(playerCards.get(randomCard));
            playerCards.remove(randomCard);
        }

    }

    @Override
    public void addCard(Card card) {
        this.playerCards.add(card);
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

    @Override
    public void printCards() {
        System.out.println(this.playerType + " CARDS;");

        for (Card card : this.playerCards) {
            System.out.println(card.getCardId());
        }

        System.out.println();
    }

    @Override
    public boolean playCard(String idPlayedCard, String lastPlayedCardValue, String lastPlayedCardColor) {

        boolean played = false;
        //System.out.println(idPlayedCard);

        for (Card card : this.playerCards) {

            if (card.getCardId().equals(idPlayedCard)
                    && (card.getCardValue().equals(lastPlayedCardValue)
                    || card.getCardColor().equals(lastPlayedCardColor))) {

                this.playerCards.remove(card);
                played = true;

            }

        }

        return played;

    }
}
