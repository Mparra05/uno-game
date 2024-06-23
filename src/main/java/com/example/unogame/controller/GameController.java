package com.example.unogame.controller;

import com.example.unogame.model.Card;
import com.example.unogame.model.Deck;
import com.example.unogame.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class GameController {

    @FXML
    Button deckButton, unoButton;

    @FXML
    GridPane playerCards, botCards;

    private Deck unoDeck;
    private Player player, bot;

    /**
     * Initializes the game controller
     */
    @FXML
    public void initialize() {

        unoDeck = new Deck();
        player = new Player("PLAYER");
        player.setPlayerCards(unoDeck.getCardsDeck());
        removePlayerCardsFromDeck(player.getPlayerCards());
        bot = new Player("BOT");
        bot.setPlayerCards(unoDeck.getCardsDeck());
        removePlayerCardsFromDeck(bot.getPlayerCards());

        if (player.canClickUno(this.player.getPlayerCards().size(), this.bot.getPlayerCards().size()))
            unoButton.setDisable(false);

    }

    /**
     * Set the action event of the deck button
     *
     * @param actionEvent
     */
    public void onHandleButtonDeck(ActionEvent actionEvent) {
        unoDeck.showDeckCards();
    }

    /**
     * Set the action event of the uno button
     *
     * @param actionEvent
     */
    public void onHandleButtonUno(ActionEvent actionEvent) {
        System.out.println("Uno Clicked");
    }

    /**
     * Remove a card of the deck
     *
     * @param playerCards
     */
    public void removePlayerCardsFromDeck(ArrayList<Card> playerCards) {

        for (Card card: playerCards) {
            unoDeck.removeCard(card.getCardId());
        }

    }

    public void showPlayerCards(String playerType) {

    }

}
