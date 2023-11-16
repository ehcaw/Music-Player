package musicplayer;
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.Pane; 
import javafx.scene.media.Media; 
import javafx.scene.media.MediaPlayer; 
import javafx.scene.media.MediaView; 

public class Player extends BorderPane{
    Media media; 
    MediaPlayer player;
    MediaView view;
    Pane pane;
    Mediabar bar; 
    public Player(String filePath){
        media = new Media(filePath);
        player = new MediaPlayer(media);
        view = new MediaView(player);
        pane = new Pane(); 
        pane.getChildren().add(view);

        setCenter(pane);
        bar = new Mediabar(player);
        player.play();
    }
    public static void main(String[] args){

    }
}
