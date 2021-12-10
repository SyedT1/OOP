/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

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
 * @author Subrata Kumar Dey
 */
public class ArithmeticOperationDemoSceneController implements Initializable {

    @FXML    private TextField xTextField;
    @FXML    private TextField yTextField;
    @FXML    private Label resultLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }        

    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String xStr, yStr, resultStr;
        xStr = xTextField.getText();    //"12"
        yStr = yTextField.getText();    //"13"
        
        //resultStr = xStr + yStr;        //"1213"
        int xVal, yVal, sum;
        xVal = Integer.parseInt(xStr);      //int 12
        //yVal = Integer.parseInt("13");      //int 13
        //yVal = Integer.parseInt("123abc");      //int 13
        yVal = Integer.parseInt(yStr);
        sum = xVal+yVal;                       //int 25
        resultStr = Integer.toString(sum);      //"25"
        //resultLabel.setText(sum);
        resultLabel.setText("X + Y = " + resultStr);
    }

    @FXML
    private void subtractButtonOnClick(ActionEvent event) {       
        resultLabel.setText(
            "X - Y = " +
            Integer.toString(
                Integer.parseInt(xTextField.getText())
                    -
                Integer.parseInt(yTextField.getText())
            )
        );
    }

    @FXML
    private void multiplyButtonOnClick(ActionEvent event) {
        resultLabel.setText(
            "Multiplied Value = " +
            //Integer.toString
            (
                Integer.parseInt(xTextField.getText())
                    *
                Integer.parseInt(yTextField.getText())
            )
        );
        
    }
}
