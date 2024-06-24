package com.example.unogame.controller;

import com.example.unogame.model.Card;
import com.example.unogame.model.Deck;
import com.example.unogame.model.FilePathEnum;
import com.example.unogame.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class GameController {

    @FXML
    Button deckButton, unoButton;

    @FXML
    GridPane gridPlayerCards, gridBotCards;

    @FXML
    ImageView lastPlayedCard;

    private Deck unoDeck;
    private Player player, bot;
    private ArrayList<Card> playedCards;

    /**
     * Initializes the game controller
     */
    @FXML
    public void initialize() {

        unoDeck = new Deck();

        playedCards = new ArrayList<Card>();
        int indexInitialCard = (int) (Math.random() * unoDeck.getCardsDeck().size());
        Card initialCard = unoDeck.getCardsDeck().get(indexInitialCard);
        playedCards.add(initialCard);
        unoDeck.removeCard(initialCard.getCardId());
        lastPlayedCard.setImage(initialCard.getCardImage());

        player = new Player("PLAYER");
        player.setDefaultPlayerCards(unoDeck.getCardsDeck());
        removePlayerCardsFromDeck(player.getPlayerCards());
        showPlayerCards(player);

        bot = new Player("BOT");
        bot.setDefaultPlayerCards(unoDeck.getCardsDeck());
        removePlayerCardsFromDeck(bot.getPlayerCards());
        showPlayerCards(bot);

        if (player.canClickUno(this.player.getPlayerCards().size(), this.bot.getPlayerCards().size()))
            unoButton.setDisable(false);

        //player.printCards();
        //bot.printCards();

        //unoDeck.showDeckCards();

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
        //System.out.println("Uno Clicked");
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

    public void showPlayerCards(Player player) {

        int iteratorCard = 0;

        for (Card card: player.getPlayerCards()) {

            if (player.getPlayerType().equals("PLAYER")) {

                ImageView cardImageView = new ImageView(card.getCardImage());
                cardImageView.setFitHeight(120);
                cardImageView.setFitWidth(80);
                cardImageView.setId(card.getCardId());
                setOnMouseClicked(player.getPlayerType(), cardImageView, card.getCardId(), iteratorCard);
                gridPlayerCards.add(cardImageView, iteratorCard, 0);

            } else if (player.getPlayerType().equals("BOT")) {

                Image cardImage = new Image(String.valueOf(getClass().getResource(FilePathEnum.CARD_UNO.getFilePath())));
                ImageView cardImageView = new ImageView(cardImage);
                cardImageView.setFitHeight(120);
                cardImageView.setFitWidth(80);
                cardImageView.setId(card.getCardId());
                setOnMouseClicked(player.getPlayerType(), cardImageView, card.getCardId(), iteratorCard);
                gridBotCards.add(cardImageView, iteratorCard, 0);

            }

            iteratorCard++;

        }

    }

    public void setOnMouseClicked(String playerType, ImageView cardImageView, String idCardImageView, int indexCardImageView) {

        cardImageView.setOnMouseClicked(new EventHandler<MouseEvent>() {

            /**
             * @param mouseEvent
             */
            @Override
            public void handle(MouseEvent mouseEvent) {

                if (playerType.equals("PLAYER")) {

                    if (player.playCard(idCardImageView,
                            playedCards.get(playedCards.size() - 1).getCardValue(),
                            playedCards.get(playedCards.size() - 1).getCardColor())) {

                        //System.out.println(playerType);
                        lastPlayedCard.setImage(cardImageView.getImage());
                        gridPlayerCards.getChildren().remove(indexCardImageView);
                        //System.out.println(gridPlayerCards.getChildren().size());
                        //System.out.println();

                    }

                }else if (playerType.equals("BOT")) {

                    if (bot.playCard(idCardImageView,
                            playedCards.get(playedCards.size() - 1).getCardValue(),
                            playedCards.get(playedCards.size() - 1).getCardColor())) {

                        //System.out.println(playerType);
                        lastPlayedCard.setImage(cardImageView.getImage());
                        gridBotCards.getChildren().remove(indexCardImageView);
                        //System.out.println(gridBotCards.getChildren().size());
                        //System.out.println();
                    }

                }

            }

        });

    }

}
