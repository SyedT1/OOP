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
import javafx.stage.Stage;
import utils.Address;
import utils.Date;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaScene3Controller implements Initializable {

    private String email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality;
    private Date DateofBirth;
    private Address permanentAddress;
    private String typeofVisaEnrollment;

    @FXML
    private ComboBox<String> visaenrollmentComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        visaenrollmentComboBox.getItems().addAll("NEW VISA APPLICATION", "ON VISA ARRIVAL", "NO VISA REQUIRED");
    }

    public void initData(String email, String sex, String firstName, String lastName, String maritalStatus, String currentLocation, String birthCountry, String occupation, String presentNationality, Date DateOfBirth, Address Adrs) {
        this.email = email;
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.currentLocation = currentLocation;
        this.birthCountry = birthCountry;
        this.occupation = occupation;
        this.presentNationality = presentNationality;
        this.DateofBirth = DateOfBirth;
        this.permanentAddress = Adrs;
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene2.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ApplyForAVisaScene4.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        ApplyForAVisaScene4Controller controller = loader.getController();
        controller.initData(email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality, DateofBirth, permanentAddress, typeofVisaEnrollment);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void visaenrollmentComboBoxonClick(ActionEvent event) {
        typeofVisaEnrollment = visaenrollmentComboBox.getValue();
    }

}
