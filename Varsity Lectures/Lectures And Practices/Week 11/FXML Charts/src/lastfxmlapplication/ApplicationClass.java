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
    
    private double x,y;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("UI1.fxml"));
        
        Scene scene = new Scene(root);
        //scene.setFill(Color.BLACK);
    
        root.setOnMousePressed(new EventHandler<MouseEvent> (){
            @Override
            public void handle(MouseEvent event){
                x = event.getSceneX();
                y = event.getSceneY();
            }
        });
        
        root.setOnMouseDragged(new EventHandler<MouseEvent> (){
            @Override
            public void handle(MouseEvent event){
                //stage.setX(event.getSceneX() - x);
                //stage.setY(event.getSceneY() - y);
                
            }
        });
        
        stage.setScene(scene);
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.initStyle(StageStyle.DECORATED);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
