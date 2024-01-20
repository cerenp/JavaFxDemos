package org.example.javaodev5.Q4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DaireEkleveSil extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setOnMouseClicked(e->{
             if (e.getButton().equals(MouseButton.PRIMARY)){
                 Circle c = new Circle(7, Color.WHITE);
                 c.setStroke(Color.BLACK);
                 c.setCenterX(e.getX());
                 c.setCenterY(e.getY());
                 c.setOnMouseClicked(mouseEvent->{
                     if(mouseEvent.getButton().equals(MouseButton.SECONDARY)){
                         ((BorderPane) c.getParent()).getChildren().remove(c);
                     }
                 });
                 borderPane.getChildren().add(c);
             }
        });
        Scene scene = new Scene(borderPane,400,250);
        primaryStage.setTitle("Daire Ekle ve Sil");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
