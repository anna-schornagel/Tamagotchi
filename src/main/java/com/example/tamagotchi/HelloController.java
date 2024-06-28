package com.example.tamagotchi;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private ImageView player;

    @FXML
    public void initialize() {
        Player playerInstance = new Player();
        player.setImage(playerInstance.getDefaultImage());
        player.setFitWidth(150);
        player.setFitHeight(150);
        player.setPreserveRatio(true);
    }

    @FXML
    private void handleFeedButtonAction() {
        Player playerInstance = new Player();
        playerInstance.feed();
        player.setImage(playerInstance.getImage());
    }
}
