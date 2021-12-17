package lastfxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML private Button ui1Button;
    @FXML private Button ui2Button;
    @FXML private Button ui3Button;
    @FXML private Button clearButton;
    @FXML private BorderPane borderPane;
    @FXML
    private Menu fileMenu;
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void loadUI(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui+".fxml"));
            borderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void ui1ButtonOnClick(MouseEvent event) {
        loadUI("UI1");
    }

    @FXML
    private void ui2ButtonOnClick(MouseEvent event) {
        loadUI("UI2");
    }

    @FXML
    private void ui3ButtonOnClick(MouseEvent event) {
        loadUI("UI3");
    }

    @FXML
    private void clearButtonOnClick(ActionEvent event) {
        borderPane.setCenter(null);      
    }

    @FXML
    private void closeStage(ActionEvent event) {
        Stage stage = (Stage) borderPane.getScene().getWindow();
        stage.close();
    }
}