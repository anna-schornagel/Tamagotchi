package com.example.tamagotchi;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private ImageView cat;

    private Image sprite0;
    private Image sprite1;
    private Image sprite2;
    private Image sprite3;
    private Image sprite4;
    private Image sprite5;
    private Image sprite6;
    private Image sprite7;

    @FXML
    private void initialize() {
        sprite0 = new Image("/com/example/tamagotchi/default_cat.jpg");
        sprite1 = new Image("/com/example/tamagotchi/food1.jpg");
        sprite2 = new Image("/com/example/tamagotchi/food2.jpg");
        sprite3 = new Image("/com/example/tamagotchi/food3.jpg");
        sprite4 = new Image("/com/example/tamagotchi/food4.jpg");
        sprite5 = new Image("/com/example/tamagotchi/food5.jpg");
        sprite6 = new Image("/com/example/tamagotchi/food6.jpg");
        sprite7 = new Image("/com/example/tamagotchi/food7.jpg");

        cat.setImage(sprite0);
    }

    @FXML
    private void handleFeedButtonAction() {
        Timeline timeline = new Timeline();
        //Adjust seconds here
        KeyFrame keyFrame1 = new KeyFrame(Duration.seconds(1), e -> cat.setImage(sprite1));
        KeyFrame keyFrame2 = new KeyFrame(Duration.seconds(2), e -> cat.setImage(sprite2));
        KeyFrame keyFrame3 = new KeyFrame(Duration.seconds(2.5), e -> cat.setImage(sprite3));
        KeyFrame keyFrame4 = new KeyFrame(Duration.seconds(3), e -> cat.setImage(sprite4));
        KeyFrame keyFrame5 = new KeyFrame(Duration.seconds(4), e -> cat.setImage(sprite5));
        KeyFrame keyFrame6 = new KeyFrame(Duration.seconds(5), e -> cat.setImage(sprite6));
        KeyFrame keyFrame7 = new KeyFrame(Duration.seconds(6), e -> cat.setImage(sprite7));
        KeyFrame keyFrame8 = new KeyFrame(Duration.seconds(7), e -> cat.setImage(sprite0));

        timeline.getKeyFrames().addAll(keyFrame1, keyFrame2, keyFrame3, keyFrame4, keyFrame5, keyFrame6, keyFrame7, keyFrame8);

        timeline.play();
    }

}
