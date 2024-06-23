package com.example.unogame.model;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardsDeck;

    public Deck() {
        this.cardsDeck = new ArrayList<>();
    }

    public void setCardsDeck() {
        for (FilePathEnum cardPath : FilePathEnum.values()) {
            if (cardPath.name().startsWith("GREEN_") ||
                    cardPath.name().startsWith("YELLOW_") ||
                    cardPath.name().startsWith("BLUE_") ||
                    cardPath.name().startsWith("RED_") ||
                    cardPath.name().startsWith("SKIP_") ||
                    cardPath.name().startsWith("RESERVE_") ||
                    cardPath.name().startsWith("TWO_WILD_DRAW_") ||
                    cardPath.name().equals("FOUR_WILD_DRAW") ||
                    cardPath.name().equals("WILD")) {
                /*Card card = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))), getCardValue(cardPath.name()), getCardColor(cardPath.name()));
                cardsDeck.add(card);
                // Print each card
                System.out.println(card.getCardValue() + " " + card.getCardColor());*/
            }
        }
        Collections.shuffle(cardsDeck);
    }

    //public String getCardValue(String cardName) {}

    //public String getCardColor(String cardName) {}

}
