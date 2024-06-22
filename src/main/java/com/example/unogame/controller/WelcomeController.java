package com.example.unogame.controller;

import com.example.unogame.view.GameStage;
import com.example.unogame.view.WelcomeStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private Button buttonPlay;

    /**
     * Sets the action event to the button play
     *
     * @param event
     * @throws IOException if throws an error while getting the GameStage instance
     */
    @FXML
    public void onHandleButtonPlay(ActionEvent event) throws IOException {
        GameStage.getInstance();
        WelcomeStage.deleteInstance();
    }

}
