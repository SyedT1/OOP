/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Address;
import utils.Date;
import utils.Passport;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaScene4Controller implements Initializable {

    private String email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality;
    private Date DateofBirth;
    private Address permanentAddress;
    private String typeofVisaEnrollment, typeOfVisa, passportType;
    private Passport p;
    private Date DOE, DOI;
    @FXML
    private ComboBox<String> typeOfVisaComboBox;
    @FXML
    private DatePicker dateOfExpiry;
    @FXML
    private DatePicker dateOfIssue;
    @FXML
    private TextField passportNoTextfield;
    @FXML
    private TextField placeOfissuetxtfield;
    @FXML
    private ComboBox<String> passportTypeComboBox;

    public void initData(String email, String sex, String firstName, String lastName, String maritalStatus, String currentLocation, String birthCountry, String occupation, String presentNationality, Date DateOfBirth, Address Adrs, String typeofVisaEnrollment) {
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
        this.typeofVisaEnrollment = typeofVisaEnrollment;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        passportTypeComboBox.getItems().addAll("ORDINARY", "OFFICIAL", "DIPLOMATIC", "OTHER", "UNITED NATIONS LAISSEZ-PASSER");
        typeOfVisaComboBox.getItems().addAll("Tourist visa", "Business visa", "Student visa", "Employment visa", "Diplomatic/Official visa", "Investor visa", "Journalist visa", "NGO visa");
        // TODO
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene3.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) throws IOException {
        p = new Passport(passportNoTextfield.getText(), placeOfissuetxtfield.getText(), DOI, DOE,passportType);
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene5.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void typeOfVisaComboBoxOnClick(ActionEvent event) {
        typeOfVisa = typeOfVisaComboBox.getValue();
    }

    @FXML
    private void dateOfExpiryOnClick(ActionEvent event) {
        LocalDate mydate = dateOfExpiry.getValue();
        String[] str = (mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).split("-");
        DOE = new Date(
                Integer.parseInt(str[0]),
                Integer.parseInt(str[1]),
                Integer.parseInt(str[2])
        );
    }

    @FXML
    private void dateOfIssueonClick(ActionEvent event) {
        LocalDate mydate = dateOfIssue.getValue();
        String[] str = (mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).split("-");
        DOI = new Date(
                Integer.parseInt(str[0]),
                Integer.parseInt(str[1]),
                Integer.parseInt(str[2])
        );
    }

    @FXML
    private void passportTypeComboBoxOnClick(ActionEvent event) {
        passportType = passportTypeComboBox.getValue();
    }

}
