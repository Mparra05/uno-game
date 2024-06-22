package com.example.unogame.view;

import com.example.unogame.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents the game stage of the Uno Game application
 * This stage displays the uno board game
 */
public class GameStage extends Stage {

    private final GameController gameController;

    /**
     * Constructor of the game stage instance
     *
     * @throws IOException if throws an error while loading the FXML
     */
    public GameStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/unogame/game-view.fxml"));
        Parent root;

        try {
            root = loader.load();
        } catch (IOException e) {
            // Re-throws the caught IOException
            throw new IOException("Error while loading FXML file ", e);
        }

        gameController = loader.getController();
        Scene scene = new Scene(root);

        /* Configuring the stage */
        // Sets the stage title
        setTitle("Uno Game");
        // Sets the stage icon
        getIcons().add(new Image(String.valueOf(getClass().getResource("/com/example/unogame/images/uno-icon.png"))));
        // Disables the stage resizing
        setResizable(false);
        // Sets the stage scene
        setScene(scene);
        // Shows the stage
        show();
    }

    /**
     * Return the game controller
     *
     * @return GameController
     */
    public GameController getGameController() {
        return gameController;
    }

    /**
     * Holder class for the singleton instance of WelcomeStage
     */
    private static class GameStageHolder {
        private static GameStage INSTANCE;
    }

    /**
     * Return the GameStage instance
     *
     * @return GameStage
     * @throws IOException if throws an error while returning the instance
     */
    public static GameStage getInstance() throws IOException {
        return GameStageHolder.INSTANCE = new GameStage();
    }

    /**
     * Delete the GameStage instance
     */
    public static void deleteInstance() {
        GameStageHolder.INSTANCE.close();
        GameStageHolder.INSTANCE = null;
    }
}