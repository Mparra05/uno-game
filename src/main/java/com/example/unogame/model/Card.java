package com.example.unogame.model;

import com.example.unogame.model.interfaces.ICard;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Represents a card of the uno game
 */
public class Card implements ICard {

    private final String cardId;
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
        this.cardId = cardValue + "_" + cardColor;
        this.cardImage = cardImage;
        this.cardImageView = new ImageView(cardImage);
        this.cardValue = cardValue;
        this.cardColor = cardColor;
    }

    public String getCardId() {
        return this.cardId;
    }

    /**
     * Return the card Image
     *
     * @return cardImage
     */
    @Override
    public Image getCardImage() {
        return this.cardImage;
    }

    /**
     * Return the card ImageView
     *
     * @return cardImageView
     */
    @Override
    public ImageView getCardImageView() {
        return this.cardImageView;
    }

    /**
     * Return the card Value
     *
     * @return cardValue
     */
    @Override
    public String getCardValue() {
        return this.cardValue;
    }

    /**
     * Return the card Color
     *
     * @return cardColor
     */
    @Override
    public String getCardColor() {
        return this.cardColor;
    }

}
