/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import users.VisaApplicant;
import users.VisaOfficer;
import utils.Date;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class AddVisaOfficersController implements Initializable, Serializable {

    @FXML
    private AnchorPane nametxtfield;
    @FXML
    private TextField sextxtfield;
    @FXML
    private TextField emailtxtfield;
    @FXML
    private DatePicker DateofBirthCalenderpicker;
    private String loginID, password;
    @FXML
    private TextField nidtxtfield;
    private Date DOB;
    @FXML
    private TextField nameTxtfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void createbuttonOnClick(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("VisaOfficerLogin.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            //String name, String sex, String NID, String email, Date DOB, String loginID, String password
            LocalDate mydate = DateofBirthCalenderpicker.getValue();
            String[] str = (mydate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))).split("-");
            DOB = new Date(
                    Integer.parseInt(str[0]),
                    Integer.parseInt(str[1]),
                    Integer.parseInt(str[2])
            );
            VisaOfficer v = new VisaOfficer(
                    nameTxtfield.getText(),
                    sextxtfield.getText(),
                    nidtxtfield.getText(),
                    emailtxtfield.getText(),
                    DOB,
                    nidtxtfield.getText() + nameTxtfield.getText(),
                    "12345678"
            );
            oos.writeObject(v);

        } catch (IOException ex) {
            Logger.getLogger(AddVisaOfficersController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AddVisaOfficersController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    private void viewallvisaofficersOnClick(ActionEvent event) {
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("VisaApplicantLogin.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            
            try {
            //    outputTextArea.setText("");
                VisaApplicant v;
                while (true) {
                    System.out.println("Printing objects.");
                    v = (VisaApplicant) ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    System.out.println(v.getName());
                //    outputTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch (Exception e) {
                System.out.println(e);
            }//nested catch     
           // outputTextArea.appendText("All objects are loaded successfully...\n");
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

}
