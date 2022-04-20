/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class DisplayController implements Initializable {

    @FXML
    private TextField EmployeesName;
    @FXML
    private TextField NIDtextfield;
    @FXML
    private DatePicker DateOfBirthField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EmployeeNameOnClick(ActionEvent event) {
    }

    @FXML
    private void NIDtextfieldOnClick(ActionEvent event) {
    }

    @FXML
    private void DateOfBirthFieldOnClick(ActionEvent event) {
    }

    @FXML
    private void createnadAppendOnClick(ActionEvent event) {
    }

    @FXML
    private void readOnClick(ActionEvent event) {
    }
    
}
