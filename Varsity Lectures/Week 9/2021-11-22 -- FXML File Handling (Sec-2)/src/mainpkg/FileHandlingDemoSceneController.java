/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Subrata Kumar Dey
 */
public class FileHandlingDemoSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private TextField fileNameTextField;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveToTextFileButtonOnClick(MouseEvent event) {
        try {
            //FileWriter fw = new FileWriter("test.txt");
            FileWriter fw = new FileWriter(fileNameTextField.getText());
            String content;
            content =   idTextField.getText()+","+
                        nameTextField.getText()+","+
                        cgpaTextField.getText()+"\n";
            fw.write(content);
            fw.close();
            
        } catch (IOException ex) {
            //Logger.getLogger(FileHandlingDemoSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
