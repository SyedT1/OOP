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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaSceneFinalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private String loginID, password;
    @FXML
    private Label displayVisaApplicantLoginID;
    @FXML
    private Label displayVisaApplicantUserPassword;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void initData(String loginID, String password) {
        this.loginID = loginID;
        this.password = password;
    }

    @FXML
    private void gotologinSceneonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void getyourloginIDandpasswordOnClick(ActionEvent event) {
        displayVisaApplicantLoginID.setText("Your login ID is " + this.loginID);
        displayVisaApplicantUserPassword.setText("Your password is " + this.password);
    }

}
