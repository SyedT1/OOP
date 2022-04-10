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
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaController implements Initializable {
    
    @FXML
    private TextField enteryouremailtextfield;
    @FXML
    private TextField captchaverifytextfield;
    @FXML
    private ImageView imgview;
    private String selectedpic;
    @FXML
    private Label errorLabel;
    @FXML
    private ImageView imgview1;
    private boolean captchapassed = false;
    
    private boolean isvalidemail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    /**
     * Initializes the controller class.
     */
    private void initimg() {
        Random r = new Random();
        File f = null;
        //FileReader fw = null;
        Scanner sc;
        String str;
        ArrayList<String> tr = new ArrayList<String>();
        try {
            f = new File("src/captchapics.txt");
            sc = new Scanner(f);
            if (f.exists()) {
                while (sc.hasNextLine()) {
                    tr.add(sc.nextLine());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ApplyForAVisaController.class.getName()).log(Level.SEVERE, null, ex);
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
        captchapassed = false;
        initimg();
    }
    
    @FXML
    private void submitToProceedOnClick(ActionEvent event) throws IOException {
        errorLabel.setText("");
        String sf = captchaverifytextfield.getText() + ".png";
        captchapassed = sf.equals(selectedpic);
        if (enteryouremailtextfield.equals("") && captchaverifytextfield.getText().equals("")) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Incomplete Information. Fill up the required fields.");
            a.showAndWait();
            return;
        }
        if (captchaverifytextfield.getText().equals("") && captchapassed == false) {
            errorLabel.setText("* Fill up the CAPTCHA to continue .");
            return;
        }
        if (sf.length() != 0 && captchapassed == false) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText("Wrong Input for CAPTCHA. Try Again");
            a.showAndWait();
            return;
            //captchaverifytextfield.clear();
        }
        if (!isvalidemail(enteryouremailtextfield.getText())) {
            Alert a = new Alert(AlertType.ERROR);
            a.setContentText(enteryouremailtextfield.getText().length() == 0 ? "Empty Email Textfield.Fill it up" : "Invalid Email");
            a.showAndWait();
            return;
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ApplyForAVisaScene2.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        //Email Data passing to scene 2 and loading scene 2
        ApplyForAVisaScene2Controller controller = loader.getController();
        controller.init_email(enteryouremailtextfield.getText());
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }
    
    @FXML
    private void checkbuttonOnClick(ActionEvent event) {
        String sf = captchaverifytextfield.getText() + ".png";
        Image image = new Image(getClass().getResourceAsStream(sf.equals(selectedpic) ? "Verified.png" : "Not_Verified.png"));
        captchapassed = sf.equals(selectedpic);
        imgview.setImage(image);
        //captchaverifytextfield.clear();
    }
    
    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
}
