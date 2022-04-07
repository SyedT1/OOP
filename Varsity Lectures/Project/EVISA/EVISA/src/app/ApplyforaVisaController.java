/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
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
    private TextField captchaverifytextfield;
    @FXML
    private ImageView imgview;
    private String selectedpic;
    @FXML
    private Label errorLabel;

    private void initimg() {
        Random r = new Random();
        File f = null;
        //FileReader fw = null;
        Scanner sc;
        String str;
        ArrayList<String> tr = new ArrayList<String>();
        try {
            f = new File("captchapics.txt");
            sc = new Scanner(f);
            if (f.exists()) {
                while (sc.hasNextLine()) {
                    tr.add(sc.nextLine());
                }
            } else {
                System.out.println("Doesn't exist");
            }
        } catch (IOException ex) {
            Logger.getLogger(ApplyforaVisaController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
        selectedpic = tr.get(r.nextInt(tr.size() - 1));
        Image image = new Image(getClass().getResourceAsStream("CAPTCHA/" + selectedpic));
        imgview.setImage(image);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initimg();
    }

    @FXML
    private void refreshbuttonOnClick(ActionEvent event) {
        initimg();
    }

    @FXML
    private void submitToProceedOnClick(ActionEvent event) {
        String sf = captchaverifytextfield.getText() + ".png";
        if (sf.equals(selectedpic)) {
            System.out.println("Yo");
        } else {
            Alert a = new Alert(AlertType.ERROR);
            if (captchaverifytextfield.getText().equals("")) {
                errorLabel.setText("* Fill up the CAPTCHA to continue .");
                return;
            }
            a.setContentText("Wrong Input for CAPTCHA. Try Again");
            a.showAndWait();
            captchaverifytextfield.clear();
        }
    }

}
