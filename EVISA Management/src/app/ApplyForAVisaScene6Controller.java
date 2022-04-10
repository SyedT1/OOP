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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaScene6Controller implements Initializable {

    @FXML
    private CheckBox RecommendationfromConcernMinistryAuthorityCheckBox;
    @FXML
    private CheckBox TradeLicenseoftheSponsoringCompany;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene5.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void RecommendationfromConcernMinistryAuthorityCheckBoxOnClick(ActionEvent event) {
    }

    @FXML
    private void TradeLicenseoftheSponsoringCompanyOnClick(ActionEvent event) {
    }

}
