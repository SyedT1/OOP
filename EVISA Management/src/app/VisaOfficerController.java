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
import java.io.Serializable;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import users.VisaApplicant;
import users.VisaOfficer;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class VisaOfficerController implements Initializable, Serializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane borderPane;
    @FXML
    private Label shownamelabeltxt;
    private VisaOfficer v;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }

    public void initData(VisaOfficer v) {
        this.v = v;
        shownamelabeltxt.setText("Welcome " + "Mr." + this.v.getName() + "\n");
    }

    private void readBinaryFileButtonOnClick(ActionEvent event) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("VisaApplicantionRequest.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            VisaApplicant a;
            try {
                while (true) {
                    a = (VisaApplicant) ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    System.out.println(a.getTypeofVisa() + "," + a.getEmail());
                    System.out.println(a.toString());
                }
            }//end of nested try
            catch (Exception e) {
                //
            }//nested catch     
//            outputTextArea.appendText("All objects are loaded successfully...\n");
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    @FXML
    private void checkvisaapplicationrequestsOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CheckVisaApplicationRequest.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        CheckVisaApplicationRequestController controller = loader.getController();
        controller.initData(v);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void checkListofapprovedcandidatesOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CheckListofApprovedcandidates.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
        //loadUI("CheckListofApprovedcandidates");
    }

    @FXML
    private void reportgenerateOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ReportgenerateVOfficer.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
//        loadUI("ReportgenerateVOfficer");
    }

}
