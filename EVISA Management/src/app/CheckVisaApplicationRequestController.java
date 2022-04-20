/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import users.VisaApplicant;
import users.VisaOfficer;
import utils.Passport;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class CheckVisaApplicationRequestController implements Initializable {

    @FXML
    private Label noOfApprovedvisaApplicants;
    private VisaOfficer v;
    @FXML
    private TableView<VisaApplicant> tableview;
    @FXML
    private TableColumn<VisaApplicant, String> namecolumn;
    @FXML
    private TableColumn<VisaApplicant, String> countrycolumn;
    @FXML
    private TableColumn<VisaApplicant, String> passportcolumn;
    private ObservableList<VisaApplicant> oList = FXCollections.observableArrayList();
    private boolean vis = false;
    @FXML
    private Label showdetailslabel;

    public ObservableList<VisaApplicant> getVisaApplicant() {

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("VisaApplicantLogin.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VisaApplicant a;
            try {
                // System.out.println("Here");
                while (true) {
                    a = (VisaApplicant) ois.readObject();
                    System.out.println(a.p.getPassportNo());
                    oList.add(a);
                }
            }//end of nested try
            catch (Exception e) {
                //
            }//nested catch     

        } catch (IOException ex) {
            //  System.out.println(ex);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }

        return oList;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        namecolumn.setCellValueFactory(new PropertyValueFactory<VisaApplicant, String>("name"));
        countrycolumn.setCellValueFactory(new PropertyValueFactory<VisaApplicant, String>("currentLocation"));
        passportcolumn.setCellValueFactory(new PropertyValueFactory<VisaApplicant, String>("PassportNo"));

    }

    public void initData(VisaOfficer v) {
        this.v = v;
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("VisaOfficer.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        VisaOfficerController controller = loader.getController();
        controller.initData(v);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void loadtableOnClick(ActionEvent event) {
        if (vis) {
            return;
        }
        tableview.setItems(getVisaApplicant());
        vis = true;
    }

    @FXML
    private void selectPersonMouseClick(MouseEvent event) throws IOException {
        VisaApplicant d = tableview.getSelectionModel().getSelectedItem();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShowDetails.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        ShowDetailsController controller = loader.getController();
        controller.initData(d);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();

    }

}
