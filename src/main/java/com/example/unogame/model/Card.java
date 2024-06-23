package com.example.unogame.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Represents the instance of a card
 */
public class Card {

    private final Image cardImage;
    private final ImageView cardImageView;
    private final String cardValue;
    private final String cardColor;

    /**
     * Constructor of the card instance
     *
     * @param cardImage image of the card
     * @param cardValue value of the card
     * @param cardColor color of the card
     */
    public Card(Image cardImage, String cardValue, String cardColor) {
        this.cardImage = cardImage;
        this.cardImageView = new ImageView(cardImage);
        this.cardValue = cardValue;
        this.cardColor = cardColor;
    }

    /**
     * Return the card Image
     *
     * @return cardImage
     */
    public Image getCardImage() {
        return this.cardImage;
    }

    /**
     * Return the card ImageView
     *
     * @return cardImageView
     */
    public ImageView getCardImageView() {
        return this.cardImageView;
    }

    /**
     * Return the card Value
     *
     * @return cardValue
     */
    public String getCardValue() {
        return this.cardValue;
    }

    /**
     * Return the card Color
     *
     * @return cardColor
     */
    public String getCardColor() {
        return this.cardColor;
    }

}
