/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import users.User;
import users.VisaApplicant;
import users.VisaOfficer;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ComboBox<String> UserComboBox;
    @FXML
    private TextField loginIDtextfield;
    @FXML
    private TextField passwordtextfield;
    private String userTypeselected;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        UserComboBox.getItems().addAll("VisaApplicant", "VACExecutive", "VisaOfficer", "MOFAOfficer", "IPOfficer");
    }

    @FXML
    private void clickherebuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisa.fxml"));

        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void loginbuttonOnClick(ActionEvent event) throws IOException {
        if (loginIDtextfield == null || "".equals(loginIDtextfield.getText()) || passwordtextfield == null || "".equals(passwordtextfield.getText()) || userTypeselected == null) {
            System.out.println("Textfields are empty");
            return;
        }
        User u = User.verifylogin(userTypeselected, loginIDtextfield.getText(), passwordtextfield.getText());
        if (u == null) {
            System.out.println("Invalid UserID/Password");
        } else if (u instanceof VisaOfficer) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("VisaOfficer.fxml"));
            Parent personViewParent = loader.load();
            Scene personViewScene = new Scene(personViewParent);
            //access the controller
            VisaOfficerController controller = loader.getController();
            controller.initData((VisaOfficer) u);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(personViewScene);
            window.show();
        } else if (u instanceof VisaApplicant) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("VisaApplicantFXML.fxml"));
            Parent personViewParent = loader.load();
            Scene personViewScene = new Scene(personViewParent);
            //access the controller
            VisaApplicantFXMLController controller = loader.getController();
            controller.initData((VisaApplicant) u);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(personViewScene);
            window.show();

        }
    }

    @FXML
    private void usertypeselectedOnClick(ActionEvent event) {
        userTypeselected = UserComboBox.getValue();
    }

    @FXML
    private void checkifitsokOnClick(ActionEvent event) throws IOException {
        /*testing purposes*/

        Parent root = FXMLLoader.load(getClass().getResource("AddVisaOfficers.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

}
