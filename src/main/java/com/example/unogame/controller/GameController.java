package com.example.unogame.controller;

import com.example.unogame.model.url_cards.FilePathEnum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class GameController {

    @FXML
    Button deckButton, unoButton;

    @FXML
    GridPane playerCards, botCards;

    @FXML
    public void initialize() {
        Image deckImage = new Image(String.valueOf(getClass().getResource("/com/example/unogame/images/uno-button.png")), 150, 100, true, false);
        ImageView deckImageView = new ImageView(deckImage);
        //unoButton.setGraphic(deckImageView);
        //unoButton.setPadding(new Insets(-10, -10, -10, -10));
        unoButton.setBackground(new Background(new BackgroundImage(deckImage, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
    }

    public void onHandleButtonDeck(ActionEvent actionEvent) {
        System.out.println("Deck Clicked");
    }

}
