package org.example.javaodev5.Q1;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class YDH extends Application {
    private final TextField tfYatirimMiktari = new TextField();
    private final TextField tfYil = new TextField();
    private final TextField tfYillikFaizOrani = new TextField();
    private final TextField tfGelecekDeger = new TextField();
    private final Button btHesapla = new Button("Hesapla");

    @Override
    public void start(Stage primaryStage) {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(4);
        gridPane.setVgap(4);
        gridPane.add(new Label("Yatırım Miktarı :"), 0, 0);
        gridPane.add(tfYatirimMiktari, 1, 0);
        gridPane.add(new Label("Yıl Sayısı :"), 0, 1);
        gridPane.add(tfYil, 1, 1);
        gridPane.add(new Label("Yıllık Faiz Oranı :"), 0, 2);
        gridPane.add(tfYillikFaizOrani, 1, 2);
        gridPane.add(new Label("Gelecek Değeri :"), 0, 3);
        gridPane.add(tfGelecekDeger, 1, 3);
        gridPane.add(btHesapla, 1, 4);


        gridPane.setAlignment(Pos.CENTER);
        tfYatirimMiktari.setAlignment(Pos.BOTTOM_RIGHT);
        tfYil.setAlignment(Pos.BOTTOM_RIGHT);
        tfYillikFaizOrani.setAlignment(Pos.BOTTOM_RIGHT);
        tfGelecekDeger.setAlignment(Pos.BOTTOM_RIGHT);
        tfGelecekDeger.setEditable(false);
        GridPane.setHalignment(btHesapla, HPos.RIGHT);


        btHesapla.setOnAction(e -> gelecekDegeriHesapla());


        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Yatırım Değeri Hesaplayıcısı");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void gelecekDegeriHesapla() {


        double aylikFaizOrani = Double.parseDouble(tfYillikFaizOrani.getText()) /1200;
        int yil = Integer.parseInt(tfYil.getText());
        double gelecekDeger = Double.parseDouble(tfYatirimMiktari.getText()) * Math.pow((1+aylikFaizOrani),yil*12);
        tfGelecekDeger.setText(String.valueOf(gelecekDeger));
    }


    public static void main(String[] args) {
        launch(args);
    }
}