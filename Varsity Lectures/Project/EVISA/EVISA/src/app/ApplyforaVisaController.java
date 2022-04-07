/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyforaVisaController implements Initializable {

    @FXML
    private TextField enteryouremailtextfield;
    @FXML
    private TextField confirmyouremailtextfield;
    @FXML
    private TextField captchaverifytextfield;
    @FXML
    private ImageView imgview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image image = new Image(getClass().getResourceAsStream("83tsU.png"));
        imgview.setImage(image);
    }    
    
}
