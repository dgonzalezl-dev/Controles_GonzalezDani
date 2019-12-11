package Temporizador;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Temporizador extends Label{

   int tiempo;
   int x;
   Timeline timeline;

    public Temporizador(int tiempo) {
        this.tiempo = tiempo;
    }

    public Temporizador() {
        this.tiempo = 10;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getX() {
        return x;
    }
    
    public void initTemporizador(){
        x=tiempo;
        timeline=new Timeline();
        setText("Quedan: "+x+" segundos");
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), new EventHandler() {
            @Override
            public void handle(Event event) {
               x--;
               setText("Quedan: "+x+" segundos");
               if(x==0)
                   timeline.stop();                  
            }
        }));
            timeline.play();
    }
}
