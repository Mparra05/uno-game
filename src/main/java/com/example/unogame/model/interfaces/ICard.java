package com.example.unogame.model.interfaces;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface ICard {

    String getCardId();
    Image getCardImage();
    ImageView getCardImageView();
    String getCardValue();
    String getCardColor();
    void duplicateCardId(String duplicated);

}
