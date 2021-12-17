/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ArithMeticOperationsController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yField;
    @FXML
    private Label resultfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addbuttononClick(ActionEvent event) {
        int getX = Integer.parseInt(xTextField.getText());
        int getY = Integer.parseInt(yField.getText());
        resultfield.setText("Adding X and Y = " + Integer.toString(getX + getY));
    }

    @FXML
    private void multiplybuttononClick(ActionEvent event) {
        int getX = Integer.parseInt(xTextField.getText());
        int getY = Integer.parseInt(yField.getText());
        resultfield.setText("Multiplying X and Y = " + (getX * getY));
    }

    @FXML
    private void subtractmethodonClick(ActionEvent event) {
        int getX = Integer.parseInt(xTextField.getText());
        int getY = Integer.parseInt(yField.getText());
        resultfield.setText("Subtracting Y from X = " + (getX - getY));
    }

    @FXML
    private void dividebuttononClick(ActionEvent event) {
        int getX = Integer.parseInt(xTextField.getText());
        int getY = Integer.parseInt(yField.getText());
        resultfield.setText("Dividing X by Y = " + (getX / getY));
    }

}
