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
public class ApplyForAVisaScene5Controller implements Initializable {

    @FXML
    private TextField purposeofvisitTextfield;
    @FXML
    private ComboBox<String> durationofproposedstaycomboBox;
    private String email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality;
    private Date DateofBirth;
    private Address permanentAddress;
    private String typeofVisaEnrollment, typeOfVisa;
    private Passport p;
    private Date tentativedateofarrivalval;
    private String durationofproposedstayval1, durationofproposedstayval2, bdvisaofficelocation;
    @FXML
    private DatePicker tentativedateofarrival;
    @FXML
    private TextField durationofstaytxtfield;
    @FXML
    private ComboBox<String> bdvisaofficeComboBox;

    /**
     * Initializes the controller class.
     */
    public void initData(String email, String sex, String firstName, String lastName, String maritalStatus, String currentLocation, String birthCountry, String occupation, String presentNationality, Date DateOfBirth, Address Adrs, String typeofVisaEnrollment, Passport p) {
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
        this.p = p;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        durationofproposedstaycomboBox.getItems().addAll("days", "months", "years");
        bdvisaofficeComboBox.getItems().addAll("THAILAND", "ABUDHABI", "ABUJA NIGERIA", "ADDIS ABABA ETHIOPIA", "AGARGAON", "AGARTALA", "AKHAODA", "ALGIERS ALGERIA", "AMMAN", "ANKARA", "ATHENS", "AUSTRIA", "BAGDAD IRAQ", "BANGALABONDO", "BAPPA", "BARISAL", "BEIJING", "BEIRUT,LEBANON", "BELGIUM");

    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene4.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) throws IOException {
        durationofproposedstayval1 = durationofstaytxtfield.getText();
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene6.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    private void durationofproposedstaycomboBoxOnClick(ActionEvent event) {
        durationofproposedstayval2 = durationofproposedstaycomboBox.getValue();
    }

    @FXML
    private void tentativedateofarrivalOnClick(ActionEvent event) {
        LocalDate mydate = tentativedateofarrival.getValue();
        String[] str = (mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).split("-");
        tentativedateofarrivalval = new Date(
                Integer.parseInt(str[0]),
                Integer.parseInt(str[1]),
                Integer.parseInt(str[2])
        );
    }

    @FXML
    private void bdvisaofficeComboBoxOnClick(ActionEvent event) {
        bdvisaofficelocation = bdvisaofficeComboBox.getValue();
    }

    @FXML
    private void durationofproposedstaycomboBox(ActionEvent event) {
    }

}
