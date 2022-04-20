/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import users.VisaApplicant;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class VisaApplicantFXMLController implements Initializable {

    @FXML
    private BorderPane borderPane;
    private VisaApplicant v;

    /**
     * Initializes the controller class.
     */
    private void loadUI(String ui) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource(ui + ".fxml"));
            borderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void initData(VisaApplicant v) {
        this.v = v;
    }

    @FXML
    private void viewapplicationbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void payfeesbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void requestconsularservicesOnClick(ActionEvent event) {
    }

    @FXML
    private void generateTravelReportOnClick(ActionEvent event) {
    }

}
