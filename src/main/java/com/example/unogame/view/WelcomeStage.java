package com.example.unogame.view;

import com.example.unogame.model.FilePathEnum;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents the welcome stage of the Uno Game application
 * This stage displays the lobby to start the game
 */
public class WelcomeStage extends Stage {

    /**
     * Constructor of the welcome stage instance
     *
     * @throws IOException if throws an error while loading the FXML
     */
    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/unogame/welcome-view.fxml"));
        Parent root;

        try {
            root = loader.load();
        } catch (IOException e) {
            // Re-throws the caught IOException
            throw new IOException("Error while loading FXML file ", e);
        }

        Scene scene = new Scene(root);

        /* Configuring the stage */
        // Sets the stage title
        setTitle("Uno Game");
        // Sets the stage icon
        getIcons().add(new Image(String.valueOf(getClass().getResource(FilePathEnum.UNO_ICON.getFilePath()))));
        // Disables the stage resizing
        setResizable(false);
        // Sets the stage scene
        setScene(scene);
        // Displays the stage
        show();
    }

    /**
     * Holder class for the singleton instance of WelcomeStage
     */
    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }

    /**
     * Return the WelcomeStage instance
     *
     * @return WelcomeStage
     * @throws IOException if throws an error while returning the instance
     */
    public static WelcomeStage getInstance() throws IOException {
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

    /**
     * Delete the WelcomeStage instance
     */
    public static void deleteInstance() {
        WelcomeStageHolder.INSTANCE.close();
        WelcomeStageHolder.INSTANCE = null;
    }
}
