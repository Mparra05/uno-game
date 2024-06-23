package com.example.unogame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class GameController {

    @FXML
    Button deckButton, unoButton;

    @FXML
    GridPane playerCards, botCards;

    /**
     * Initializes the game controller
     */
    @FXML
    public void initialize() {}

    /**
     * Set the action event of the deck button
     *
     * @param actionEvent
     */
    public void onHandleButtonDeck(ActionEvent actionEvent) {
        System.out.println("Deck Clicked");
    }

    /**
     * Set the action event of the uno button
     *
     * @param actionEvent
     */
    public void onHandleButtonUno(ActionEvent actionEvent) {
        System.out.println("Uno Clicked");
    }

}
