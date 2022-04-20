/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.stage.Stage;
import users.VisaApplicant;
import utils.Address;
import utils.Date;
import utils.Passport;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ApplyForAVisaScene6Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    private String email, sex, firstName, lastName, maritalStatus, currentLocation, birthCountry, occupation, presentNationality;
    private Date DateofBirth;
    private Address permanentAddress;
    private String typeofVisaEnrollment, typeOfVisa,passportNo;
    private Passport p;
    private Date tentativedateofarrivalval;
    private String durationofproposedstayval1, durationofproposedstayval2, bdvisaofficelocation;
    //Scene 6 Additions
    private ArrayList<String> RequiredDocuments;
    private String loginID, password, NID;

    public void initData(String email, String sex, String firstName, String lastName, String maritalStatus, String currentLocation, String birthCountry, String occupation, String presentNationality, Date DateOfBirth, Address Adrs, String typeofVisaEnrollment, Passport p, String typeofVisa, Date tentativedateofarrivalval, String durationofproposedstayval1, String durationofproposedstayval2, String bdvisaofficelocation) {
        this.email = email;
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.currentLocation = currentLocation;
        this.birthCountry = birthCountry;
        this.occupation = occupation;
        this.presentNationality = presentNationality;
        this.DateofBirth = DateOfBirth;
        this.permanentAddress = Adrs;
        this.typeofVisaEnrollment = typeofVisaEnrollment;
        this.p = p;
        this.typeOfVisa = typeofVisa;
        this.tentativedateofarrivalval = tentativedateofarrivalval;
        this.durationofproposedstayval1 = durationofproposedstayval1;
        this.durationofproposedstayval2 = durationofproposedstayval2;
        this.bdvisaofficelocation = bdvisaofficelocation;
        this.passportNo = p.getPassportNo();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RequiredDocuments = new ArrayList<String>();
        // TODO
    }

    @FXML
    private void backbuttonOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ApplyForAVisaScene5.fxml"));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @FXML
    private void saveandproceedbuttonOnClick(ActionEvent event) throws IOException {
        this.password = Randompasswordgenerator.generatePassword(10);
        this.loginID = currentLocation + p.getPassportNo() + firstName;
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("VisaApplicantLogin.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            //
            oos.writeObject(
                    new VisaApplicant(currentLocation,
                            firstName, lastName,
                            birthCountry, sex,
                            bdvisaofficelocation, maritalStatus,
                            occupation, presentNationality,
                            permanentAddress,
                            DateofBirth, tentativedateofarrivalval,
                            typeOfVisa, typeofVisaEnrollment,
                            NID, email,
                            p, loginID,
                            password,
                            passportNo
                    )
            );

        } catch (IOException ex) {
            Logger.getLogger(ApplyForAVisaScene6Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ApplyForAVisaScene6Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ApplyForAVisaSceneFinal.fxml"));
        Parent personViewParent = loader.load();
        Scene personViewScene = new Scene(personViewParent);
        //access the controller
        ApplyForAVisaSceneFinalController controller = loader.getController();
        controller.initData(loginID, password);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(personViewScene);
        window.show();
    }

    @FXML
    private void RecommendationfromConcernMinistryAuthorityCheckBoxOnClick(ActionEvent event) {
        RequiredDocuments.add("Recommendation from Concern Ministry Authority");
    }

    @FXML
    private void TradeLicenseoftheSponsoringCompanyOnClick(ActionEvent event) {
        RequiredDocuments.add("Trade License of the Sponsoring Company");
    }

    @FXML
    private void passportcopyOnClick(ActionEvent event) {
        RequiredDocuments.add("Passport copy");
    }

    @FXML
    private void FatherORMotherORHusbandsVisaCopyOnClick(ActionEvent event) {
        RequiredDocuments.add("Father OR Mother OR Husbands Visa Copy");
    }

    @FXML
    private void PaymentSlipOnClick(ActionEvent event) {
        RequiredDocuments.add("Payment Slip");
    }

    @FXML
    private void SecurityClearanceOnClick(ActionEvent event) {
        RequiredDocuments.add("Security Clearance");
    }

    @FXML
    private void birthCertificateOnClick(ActionEvent event) {
        RequiredDocuments.add("birth Certificate on Click");
    }

    @FXML
    private void marriageCertificateOnClick(ActionEvent event) {
        RequiredDocuments.add("marriage Certificate On Click");
    }

    @FXML
    private void OverStayPaymentOnClick(ActionEvent event) {
        RequiredDocuments.add("over stay payment");
    }

}
