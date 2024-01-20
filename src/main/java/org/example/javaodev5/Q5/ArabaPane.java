package org.example.javaodev5.Q5;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class ArabaPane extends Pane {
    int tekerlekYaricap = 20;
    Circle[] tekerlekler = new Circle[2];
    Rectangle govde = new Rectangle(tekerlekYaricap * 10, tekerlekYaricap * 2);

    Polyline cati = new Polyline();

    Timeline animasyon;

    ArabaPane() {
        this.setWidth(tekerlekYaricap*5);
        this.setHeight(tekerlekYaricap*10);
        arabaCiz();
        animasyon = new Timeline(
                new KeyFrame(Duration.millis(10)
                        , e -> arabaHareketEttir()));
        animasyon.setCycleCount(Timeline.INDEFINITE);
        animasyon.play();
    }

    public void durdur() {
        animasyon.pause();
    }

    public void oynat() {
        animasyon.play();
    }

    public void hizlandir() {
        animasyon.setRate(animasyon.getRate() + 0.2);
    }

    public void yavaslat() {
        animasyon.setRate(animasyon.getRate() - 0.2);
    }

    private void arabaCiz()
    {
        this.getChildren().clear();
        this.cati.getPoints().clear();
        tekerlekler[0] = new Circle(tekerlekYaricap * 3, tekerlekYaricap * 10  * 0.8, tekerlekYaricap, Color.BLACK);
        tekerlekler[1] = new Circle(tekerlekYaricap * 7, tekerlekYaricap * 10  * 0.8, tekerlekYaricap, Color.BLACK);

        var solTeker = tekerlekler[0];
        govde.setX(solTeker.getCenterX() - tekerlekYaricap * 3);
        govde.setY(solTeker.getCenterY() - tekerlekYaricap * 3);
        govde.setFill(Color.PINK);

        cati.getPoints().addAll(
                solTeker.getCenterX() - tekerlekYaricap, solTeker.getCenterY() - tekerlekYaricap * 3,
                solTeker.getCenterX() + tekerlekYaricap, solTeker.getCenterY() - tekerlekYaricap * 5,
                solTeker.getCenterX() + tekerlekYaricap * 3, solTeker.getCenterY() - tekerlekYaricap * 5,
                solTeker.getCenterX() + tekerlekYaricap * 5, solTeker.getCenterY() - tekerlekYaricap * 3
        );
        cati.setFill(Color.LIGHTBLUE);
            this.getChildren().addAll(tekerlekler[0], tekerlekler[1], govde, cati);

    }

    private void arabaHareketEttir() {
        if (tekerlekler[0].getCenterX() > this.getWidth()) {
            arabaCiz();
        } else {
            for (Circle circle : tekerlekler) {
                circle.setCenterX(circle.getCenterX() + 1);
            }
            govde.setX(govde.getX() + 1);
            for (int i = 0; i < cati.getPoints().size(); i++) {
                if (i % 2 == 0) {
                    cati.getPoints().set(i, cati.getPoints().get(i) + 1);
                }
            }
        }
    }


}
