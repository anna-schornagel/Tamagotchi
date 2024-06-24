package com.example.tamagotchi;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Player extends ImageView {
    private int currentFrame;
    private Image[] sprintFrames;
    private Image defaultImage;

    public Player() {
        sprintFrames = new Image[3];
//        for (int i = 0; i < 3; i++) {
//            sprintFrames[i] = loadImage("com/example/tamagotchi/sprint" + i + ".jpg");
//        }
        defaultImage = loadImage("com/example/tamagotchi/default_cat.jpg");
        currentFrame = 0;
        setImage(defaultImage);
        setFitWidth(100);  // Set desired width
        setFitHeight(100); // Set desired height
        setPreserveRatio(true); // Preserve aspect ratio
    }

    private void sprint() {
        currentFrame = (currentFrame + 1) % sprintFrames.length;
        setImage(sprintFrames[currentFrame]);
    }

    public void feed() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1.0), event -> sprint()));
        timeline.setCycleCount(3); // Three sprints
        timeline.setOnFinished(event -> setImage(defaultImage)); // Return to default image after 3 sprints
        timeline.play();
    }

    private Image loadImage(String path) {
        var resource = getClass().getResource("/" + path);
        if (resource == null) {
            throw new IllegalArgumentException("Invalid URL or resource not found: " + path);
        }
        return new Image(resource.toString());
    }

    public Image getDefaultImage() {
        return defaultImage;
    }
}
