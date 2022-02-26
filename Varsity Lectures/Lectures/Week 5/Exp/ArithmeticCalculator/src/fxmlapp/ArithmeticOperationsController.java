/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ArithmeticOperationsController implements Initializable {

    @FXML
    private TextField xTxtField;
    @FXML
    private TextField yTxtField;
    @FXML
    private Label ResultLab;
    @FXML
    private ChoiceBox<Integer> myChoiceBox;
    private Integer[] arr = {0, 1, 2, 3, 4};
    private int limit = 0;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        myChoiceBox.getItems().addAll(arr);
        myChoiceBox.setOnAction(this::setvalue);
    }

    public void setvalue(ActionEvent event) {
        limit = myChoiceBox.getValue();
    }

    @FXML
    private void addOnClick(ActionEvent event) {
        if (xTxtField.getText().trim().isEmpty() || yTxtField.getText().trim().isEmpty()) {
            ResultLab.setText("One or Both of the TextFields is/are empty");
            return;
        }
        double x = Double.parseDouble(xTxtField.getText());
        double y = Double.parseDouble(yTxtField.getText());
        String res = "%." + Integer.toString(limit) + "f";
        ResultLab.setText(String.format(res, x + y));
    }

    @FXML
    private void multiplyOnClick(ActionEvent event) {
        if (xTxtField.getText().trim().isEmpty() || yTxtField.getText().trim().isEmpty()) {
            ResultLab.setText("One or Both of the TextFields is/are empty");
            return;
        }
        double x = Double.parseDouble(xTxtField.getText());
        double y = Double.parseDouble(yTxtField.getText());
        String res = "%." + Integer.toString(limit) + "f";
        ResultLab.setText(String.format(res, x * y));
    }

    @FXML
    private void divideOnClick(ActionEvent event) {
        if (xTxtField.getText().trim().isEmpty() || yTxtField.getText().trim().isEmpty()) {
            ResultLab.setText("One or Both of the TextFields is/are empty");
            return;
        }
        double x = Double.parseDouble(xTxtField.getText());
        double y = Double.parseDouble(yTxtField.getText());
        if (y == 0) {
            ResultLab.setText("Expected a non-zero denominator");
            return;
        }
        String res = "%." + Integer.toString(limit) + "f";
        ResultLab.setText(String.format(res, x / y));
    }

}
