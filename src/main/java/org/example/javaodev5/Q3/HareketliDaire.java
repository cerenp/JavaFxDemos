package org.example.javaodev5.Q3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class HareketliDaire extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Circle circle = new Circle(50, Color.PINK);


    @Override
    public void start(Stage primaryStage) {

        BorderPane pane = new BorderPane(circle);
        BorderPane.setAlignment(circle,Pos.CENTER);
        Scene scene = new Scene(pane, 400, 250);
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    circle.setTranslateY(circle.getTranslateY() - 13);
                    break;
                case DOWN:
                    circle.setTranslateY(circle.getTranslateY() + 13);
                    break;
                case LEFT:
                    circle.setTranslateX(circle.getTranslateX() - 13);
                    break;
                case RIGHT:
                    circle.setTranslateX(circle.getTranslateX() + 13);
                    break;
            }
        });
        primaryStage.setTitle("Hareketli Daire");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }
}
