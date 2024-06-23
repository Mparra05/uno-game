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
     * Set the action event of the play button
     *
     * @param actionEvent
     * @throws IOException if throws an error while getting the GameStage instance
     */
    @FXML
    public void onHandleButtonPlay(ActionEvent actionEvent) throws IOException {
        GameStage.getInstance();
        WelcomeStage.deleteInstance();
    }

}
