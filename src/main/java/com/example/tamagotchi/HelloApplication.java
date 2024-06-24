package com.example.tamagotchi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        Player player = new Player();
//        player.setX(100);
//        player.setY(100);

        Button feedButton = new Button("Feed");
//        feedButton.setLayoutX(50);
//        feedButton.setLayoutY(400);
        feedButton.setOnAction(event -> player.feed());

        Pane root = new Pane(player, feedButton);
        Scene scene = new Scene(root, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tamagotchi");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
