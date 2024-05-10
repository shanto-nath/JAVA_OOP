package lastfxmlapplication;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ApplicationClass extends Application {
      
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Pdf101Scene.fxml"));       
        Scene scene = new Scene(root);          
        stage.setScene(scene);
        stage.show();
    }

    public void paint(int colorCode){
        System.out.println("cOLORcODE "+colorCode + " IS USED.");
    }
    public void paint(Color c){
        if(c==Color.GREEN){}
        System.out.println("cOLORcODE "+c + " IS USED.");
    }    
    public static void main(String[] args) {
        launch(args);
    }
    
}
