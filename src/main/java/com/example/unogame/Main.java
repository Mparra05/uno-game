package com.example.unogame;

import com.example.unogame.view.WelcomeStage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    /**
     * Launches the start method
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Starts the application with the WelcomeStage instance
     *
     * @param stage
     * @throws IOException if throws an error when the application is started
     */
    @Override
    public void start(Stage stage) throws IOException {
        WelcomeStage.getInstance();
    }
}
