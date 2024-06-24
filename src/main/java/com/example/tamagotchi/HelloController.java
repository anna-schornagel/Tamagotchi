package com.example.tamagotchi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView defaultImageView;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ImageView player;

    @FXML
    public void initialize() {
        Player playerInstance = new Player();
        player.setImage(playerInstance.getDefaultImage());
        player.setFitWidth(playerInstance.getFitWidth());
        player.setFitHeight(playerInstance.getFitHeight());
        player.setPreserveRatio(true);
    }

    @FXML
    private void handleFeedButtonAction() {
        Player playerInstance = new Player();
        playerInstance.feed();
        player.setImage(playerInstance.getImage());
    }
}