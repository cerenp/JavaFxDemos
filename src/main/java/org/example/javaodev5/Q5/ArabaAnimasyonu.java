package org.example.javaodev5.Q5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;

public class ArabaAnimasyonu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ArabaPane arabaPane = new ArabaPane();
        arabaPane.setOnKeyPressed(e ->{
            switch (e.getCode()){
                case UP -> arabaPane.hizlandir();
                case DOWN -> arabaPane.yavaslat();
            }
        });
        arabaPane.setOnMousePressed(e->{
            if(e.getButton().equals(MouseButton.PRIMARY)){
                arabaPane.durdur();
            }
        });
        arabaPane.setOnMouseReleased(e->{
            if(e.getButton().equals(MouseButton.PRIMARY)){
                arabaPane.oynat();
            }
        });
        Scene scene = new Scene(arabaPane,950,200);
        primaryStage.setScene(scene);
        primaryStage.show();

        arabaPane.requestFocus();

    }
}
