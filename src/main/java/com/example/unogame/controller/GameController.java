package com.example.unogame.controller;

import com.example.unogame.model.url_cards.FilePathEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;

public class GameController {

    @FXML
    Button deckButton;

    @FXML
    public void initialize() {
        /*Image deckImage = new Image(String.valueOf(getClass().getResourceAsStream("images/uno-cards/deck_of_cards.png")));
        ImageView deckImageView = new ImageView(deckImage);
        deckButton.setGraphic(deckImageView);*/
    }

    public void onHandleButtonDeck(ActionEvent actionEvent) {
        System.out.println("Deck Clicked");
    }

}
