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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.Address;
import utils.Date;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaScene2Controller implements Initializable {

    @FXML
    private RadioButton malerb;
    @FXML
    private RadioButton femalerb;
    @FXML
    private RadioButton othersrb;
    @FXML
    private DatePicker dateofBirthCalenderPicker;
    @FXML
    private ComboBox<String> presentNationalityComboBox;
    @FXML
    private ComboBox<String> birthcountrycomboBox;
    @FXML
    private ComboBox<String> currentLocationcomboBox;
    @FXML
    private TextField firstNametxtfield;
    @FXML
    private TextField lastnametxtfield;
    @FXML
    private ComboBox<String> occupationComboBox;
    @FXML
    private ComboBox<String> maritalstatusComboBox;
    @FXML
    private TextField citynametxtfield;
    @FXML
    private TextField countrynametxtfield;
    @FXML
    private Label streetnametxtfield;
    private String email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality;
    private Date DateofBirth;
    private Address permanentAddress;

    public void init_email(String s) {
        email = s;
    }

    /**
     * Initializes the controller class. Ensure Data Passing
     */
    private void fillupComboBoxes() {
        birthcountrycomboBox.getItems().addAll("ALGERIA", "ALBANIA", "ALGERIA", "ANGOLA", "ANTARCTICA", "ARMENIA", "BANGLADESH", "BELARUS", "CHINA", "DENMARK", "GREECE", "GREENLAND", "GHANA", "GUINEA", "HONG KONG", "HUNGARY", "INDIA", "SRI LANKA", "MALAYSIA");
        presentNationalityComboBox.getItems().addAll("ALGERIAN", "ALBANIAN", "ALGERIAN", "ALGOLAN", "ANTARCTIC", "ARMENIAN", "BANGLADESHI", "BELARUSAN", "CHINESE", "DANISH", "GREEK", "GREENLANDIC", "GHANAIN", "GUINEAN", "HONG KONGESE", "HUNGARIAN", "INDIAN", "SRI LANKAN", "MALAYSIAN");
        currentLocationcomboBox.getItems().addAll("ALGERIA", "ALBANIA", "ALGERIA", "ANGOLA", "ANTARCTICA", "ARMENIA", "BELARUS", "CHINA", "DENMARK", "GREECE", "GREENLAND", "GHANA", "GUINEA", "HONG KONG", "HUNGARY", "INDIA", "SRI LANKA", "MALAYSIA");
        occupationComboBox.getItems().addAll("ACCOUNTANT", "ARTIST", "BACHELOR", "BANKER", "BARBER", "BARRISTER AT LAW", "BLACKSMITH", "BOATMAN", "BUSINESS", "CONTRACTOR", "COOK", "DOCTOR", "DRIVER", "ENGINEER", "FARMER", "FISHERMAN", "GOVERNMENT SERVICE", "GUARD", "HOUSEWIFE", "SOFTWARE ENGINEER", "TEACHER");
        maritalstatusComboBox.getItems().addAll("SINGLE", "MARRIED", "SEPARATED", "DIVORCED", "WIDOWED", "ENGAGED", "INVALID", "ANNULLED", "COHABITATING", "DECEASED", "SPOUSE'S DEATH", "COMMON LAW", "NONE");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fillupComboBoxes();
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisa.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) throws IOException {
        firstName = firstNametxtfield.getText();
        lastName = lastnametxtfield.getText();
        permanentAddress = new Address(streetnametxtfield.getText(), citynametxtfield.getText(), countrynametxtfield.getText());
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ApplyForAVisaScene3.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        ApplyForAVisaScene3Controller controller = loader.getController();
        controller.initData(email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality, DateofBirth, permanentAddress);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void saveDOBonClick(ActionEvent event) {
        LocalDate mydate = dateofBirthCalenderPicker.getValue();
        String[] str = (mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).split("-");
        DateofBirth = new Date(
                Integer.parseInt(str[0]),
                Integer.parseInt(str[1]),
                Integer.parseInt(str[2])
        );
    }

    @FXML
    private void presentNationalityComboBoxOnClick(ActionEvent event) {
        presentNationality = presentNationalityComboBox.getValue();
    }

    @FXML
    private void birthcountrycomboBoxOnClick(ActionEvent event) {
        birthCountry = birthcountrycomboBox.getValue();
    }

    @FXML
    private void currentLocationcomboBoxOnClick(ActionEvent event) {
        currentLocation = currentLocationcomboBox.getValue();
    }

    @FXML
    private void occupationComboBoxOnClick(ActionEvent event) {
        occupation = occupationComboBox.getValue();
    }

    @FXML
    private void maritalComboBoxOnClick(ActionEvent event) {
        maritalStatus = maritalstatusComboBox.getValue();
    }

    @FXML
    private void radiobuttonOnClick(ActionEvent event) {
        sex = (malerb.isSelected() ? "Male" : (femalerb.isSelected() ? "Female" : (othersrb.isSelected() ? "Others" : "")));
    }

}
