package org.example.javaodev5.Q2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RenkliDaire extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final Circle circle = new Circle(50, Color.PINK);

    @Override
    public void start(Stage primaryStage) {
        circle.setStroke(Color.BLACK);
        VBox vBox = new VBox(circle);
        vBox.setAlignment(Pos.CENTER);
        circle.setOnMousePressed(e -> {
            if (e.getButton()== MouseButton.PRIMARY)
                circle.setFill(Color.BLACK);
        });
        circle.setOnMouseReleased(e -> {
            if (e.getButton()== MouseButton.PRIMARY)
                circle.setFill(Color.WHITE);
        });
        Scene scene = new Scene(vBox, 400, 250);

        primaryStage.setTitle("Renkli Daire ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
