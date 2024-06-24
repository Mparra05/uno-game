package com.example.unogame.model;

import com.example.unogame.model.interfaces.IDeck;
import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents the deck of the uno game
 */
public class Deck implements IDeck {

    private ArrayList<Card> cardsDeck;

    /**
     * Constructor of the deck instance
     */
    public Deck() {
        this.cardsDeck = new ArrayList<>();
        setCardsDeck();
    }

    /**
     * Set the cards deck of the uno game
     */
    @Override
    public void setCardsDeck() {

        for (FilePathEnum cardPath : FilePathEnum.values()) {

            if (cardPath.name().startsWith("RED") || cardPath.name().startsWith("BLUE") ||
                    cardPath.name().startsWith("YELLOW") || cardPath.name().startsWith("GREEN") ||
                    cardPath.name().equals("WILD") || cardPath.name().startsWith("TWO_WILD_DRAW") ||
                    cardPath.name().equals("FOUR_WILD_DRAW") || cardPath.name().startsWith("SKIP") ||
                    cardPath.name().startsWith("RESERVE")) {

                Card card = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))),
                        getCardValue(cardPath.name()), getCardColor(cardPath.name()));



                if (!(getCardValue(cardPath.name()).equals("0")) &&
                        !(getCardColor(cardPath.name()).equals("BLACK"))){

                    card.duplicateCardId("A");
                    cardsDeck.add(card);

                    Card card2 = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))),
                            getCardValue(cardPath.name()), getCardColor(cardPath.name()) + "_B");
                    cardsDeck.add(card2);

                } else if (getCardColor(cardPath.name()).equals("BLACK")) {

                    card.duplicateCardId("A");
                    cardsDeck.add(card);

                    Card card2 = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))),
                            getCardValue(cardPath.name()), getCardColor(cardPath.name()) + "_B");
                    cardsDeck.add(card2);

                    Card card3 = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))),
                            getCardValue(cardPath.name()), getCardColor(cardPath.name()) + "_C");
                    cardsDeck.add(card3);

                    Card card4 = new Card(new Image(String.valueOf(getClass().getResource(cardPath.getFilePath()))),
                            getCardValue(cardPath.name()), getCardColor(cardPath.name()) + "_D");
                    cardsDeck.add(card4);

                } else {

                    cardsDeck.add(card);
                    /*System.out.println(card.getCardId() + ": " +card.getCardValue()
                            + " " + card.getCardColor());*/

                }

            }

        }

        Collections.shuffle(cardsDeck);

    }

    /**
     * Get the card value
     *
     * @param cardName
     * @return cardValue
     */
    @Override
    public String getCardValue(String cardName) {

        if (cardName.endsWith("0")) {
            return "0";
        } else if (cardName.endsWith("1")) {
            return "1";
        } else if (cardName.endsWith("2")) {
            return "2";
        } else if (cardName.endsWith("3")) {
            return "3";
        } else if (cardName.endsWith("4")) {
            return "4";
        } else if (cardName.endsWith("5")) {
            return "5";
        } else if (cardName.endsWith("6")) {
            return "6";
        } else if (cardName.endsWith("7")) {
            return "7";
        } else if (cardName.endsWith("8")) {
            return "8";
        } else if (cardName.endsWith("9")) {
            return "9";
        } else if (cardName.startsWith("RESERVE")) {
            return "RESERVE";
        } else if (cardName.startsWith("SKIP")) {
            return "SKIP";
        } else if (cardName.startsWith("FOUR_WILD_DRAW")) {
            return "FOUR_WILD_DRAW";
        } else if (cardName.startsWith("TWO_WILD_DRAW")) {
            return "TWO_WILD_DRAW";
        } else if (cardName.startsWith("WILD")) {
            return "WILD";
        }else {
            return "NONE";
        }

    }

    /**
     * Get the card color
     *
     * @param cardName
     * @return cardColor
     */
    @Override
    public String getCardColor(String cardName) {

        if (cardName.contains("RED")) {
            return "RED";
        } else if (cardName.contains("BLUE")) {
            return "BLUE";
        }
        else if (cardName.contains("YELLOW")) {
            return "YELLOW";
        }
        else if (cardName.contains("GREEN")) {
            return "GREEN";
        } else if(cardName.contains("WILD")) {
            return "BLACK";
        }else {
            return "NONE";
        }

    }

    @Override
    public ArrayList<Card> getCardsDeck() {
        return this.cardsDeck;
    }

    @Override
    public void showDeckCards() {

        for (Card card : this.cardsDeck) {
            System.out.println(card.getCardId() + " - Value: " + card.getCardValue()
                    + " - Value:" + card.getCardColor());
            System.out.println(card.getCardId());
        }

        System.out.println(this.cardsDeck.size());

    }

    @Override
    public void removeCard(String cardId) {

        cardsDeck.removeIf(card -> card.getCardId().equals(cardId));

    }

}
