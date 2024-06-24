package com.example.tamagotchi;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Player extends ImageView {
    private int currentState;
    private int currentFrame;
    private Image[] sprintFrames;
    private Image defaultImage;

    public Player() {
        sprintFrames = new Image[3];
//        for (int i = 0; i < 3; i++) {
////            sprintFrames[i] = new Image("sprint" + i + ".jpg");
////        }

        defaultImage = new Image("com/example/tamagotchi/default_cat.jpg");
        currentFrame = 0;
        setImage(defaultImage);
        setFitWidth(500);  // Set desired width
        setFitHeight(500); // Set desired height
        setPreserveRatio(true); // Preserve aspect ratio
    }

    public void sprint() {
        currentFrame = (currentFrame + 1) % sprintFrames.length;
        setImage(sprintFrames[currentFrame]);
    }

    public void feed() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            sprint();
        }));
        timeline.setCycleCount(3);
        timeline.setOnFinished(event -> setImage(defaultImage));
        timeline.play();
    }

    public Image getDefaultImage() {
        return defaultImage;
    }
}
