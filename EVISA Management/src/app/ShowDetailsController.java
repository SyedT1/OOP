/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import users.VisaApplicant;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ShowDetailsController implements Initializable, Serializable {

    private VisaApplicant v;
    @FXML
    private Label namelabel;
    @FXML
    private Label dateofBirthlabel;
    @FXML
    private Label presentNationality;
    @FXML
    private Label dateofissuelabel;
    @FXML
    private Label dateofexpirylabel;
    @FXML
    private Label passportNolabel;

    /**
     * Initializes the controller class.
     */
    public void initData(VisaApplicant v) {
        this.v = v;
        dateofBirthlabel.setText(v.getDateofBirth());
        passportNolabel.setText(v.getPassportNo());
        dateofexpirylabel.setText(v.p.dateofexpiry.toString());
        dateofissuelabel.setText(v.p.dateofissue.toString());
        presentNationality.setText(v.getPresentNationality());
        namelabel.setText(v.getName());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
