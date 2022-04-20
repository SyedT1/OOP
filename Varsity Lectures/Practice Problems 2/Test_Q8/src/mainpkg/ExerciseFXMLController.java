/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author thinker
 */
public class ExerciseFXMLController implements Initializable, Serializable {

    @FXML
    private TextField idtextfield = null;
    @FXML
    private TextField nametextfield = null;
    @FXML
    private TextField cgpatextfield = null;
    @FXML
    private TextField minrequirementtextfield = null;
    @FXML
    private Label resultlabel;
    private TextArea outputtextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void appendtobinfile(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("Stud.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            if ("".equals(idtextfield.getText()) || "".equals(nametextfield.getText()) || "".equals(cgpatextfield.getText())
                    || idtextfield == null || nametextfield == null || cgpatextfield == null) {
                System.out.println("Fill in all the fields properly");
                return;
            }
            Student s = new Student(
                    idtextfield.getText(),
                    nametextfield.getText(),
                    cgpatextfield.getText()
            );
            oos.writeObject(s);
        } catch (IOException ex) {
            Logger.getLogger(ExerciseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ExerciseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void writescholarshipbuttonOnClick(ActionEvent event) throws IOException {
        File f = null;
        FileWriter fw = null;
        double totalcgpa = 0.0, foundpeople = 0;
        try {
            f = new File("Scholarship.txt");
            if (f.exists()) {
                fw = new FileWriter(f, true);
            } else {
                fw = new FileWriter(f);
            }
            File fnew = null;
            FileInputStream fnewis = null;
            ObjectInputStream onewis = null;
            try {
                fnew = new File("Stud.bin");
                fnewis = new FileInputStream(fnew);
                onewis = new ObjectInputStream(fnewis);
                Student takein;
                while (true) {
                    takein = (Student) onewis.readObject();
                    double mncgpa = Double.parseDouble(minrequirementtextfield.getText());
                    double inputcgpa = Double.parseDouble(takein.getCgpa());
                    if (inputcgpa >= mncgpa) {
                        fw.write(takein.toString());
                        totalcgpa += inputcgpa;
                        foundpeople++;
                    }
                }
            } catch (Exception ex) {

            } finally {
                try {
                    if (onewis != null) {
                        onewis.close();
                    }
                } catch (Exception ex) {

                }
            }
        } catch (IOException ex) {

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                    resultlabel.setText(Double.toString(totalcgpa / foundpeople));
                }
            } catch (Exception ex) {

            }
        }

    }

    private void readAllbuttonOnClick(ActionEvent event) {
        outputtextArea.clear();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            f = new File("Stud.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Student s;
            outputtextArea.appendText("Contents of the file:\n");
            while (true) {
                s = (Student) ois.readObject();
                outputtextArea.appendText(s.toString() + "\n");
            }
        } catch (Exception ex) {
            //  Logger.getLogger(ExerciseFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void idOnMouseClick(MouseEvent event) {
        idtextfield.clear();
    }

    @FXML
    private void nameOnMouseClick(MouseEvent event) {
        nametextfield.clear();
    }

    @FXML
    private void cgpaOnMouseClick(MouseEvent event) {
        cgpatextfield.clear();
    }

    @FXML
    private void mincgpaOnMouseClick(MouseEvent event) {
        minrequirementtextfield.clear();
    }

}
