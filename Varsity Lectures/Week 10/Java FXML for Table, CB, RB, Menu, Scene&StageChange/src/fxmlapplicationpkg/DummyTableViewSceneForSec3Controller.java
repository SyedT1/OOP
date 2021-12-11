/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlapplicationpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Subrata Kumar Dey
 */
public class DummyTableViewSceneForSec3Controller implements Initializable {

    @FXML
    private CheckBox cppCheckBox;
    @FXML
    private CheckBox isJavaCheckBox;
    @FXML
    private TableView<?> studentTableView;
    @FXML
    private TableColumn<?, ?> idTableColumn;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> cgpaTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
