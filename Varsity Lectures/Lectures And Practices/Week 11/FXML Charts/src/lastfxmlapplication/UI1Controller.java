
package lastfxmlapplication;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UI1Controller implements Initializable {

    @FXML private PieChart pieChart;
    @FXML private Button loadPieChartButton;
    @FXML private Label statusLabel;


    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }    

    @FXML
    private void loadPieChartButtonOnClick(ActionEvent event) {
        ObservableList <PieChart.Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Java",50),
            new PieChart.Data("C++",20),
            new PieChart.Data("Python",30),
            new PieChart.Data("C#",10),
            new PieChart.Data("C",15)
        );
        
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
    }        

    

    /*
    private void loadPieChartAndCreatePdfButtonOnClick(ActionEvent event) {
        try {
            //Document doc = new Document();
            //PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("Report.pdf"));           
            //doc.open();
            File chartFile =  new File("chartFile");
            //add chart to PDF
            Scene scene  = new Scene(pieChart,300,300);
            //pieChart.getData().add(series);
            WritableImage image = scene.snapshot(null);
            //fXImage image = scene.snapshot(null);
            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", chartFile);
            
            BufferedImage bufImg = pieChart.createBufferedImage(300, 300);
            //Image chart = Image.getInstance(writer, bufImg, 1.0f);           
            //doc.add(chart);
            //doc.close();
            JOptionPane.showMessageDialog(null,"Report Saved");
        } 
        catch (FileNotFoundException ex){} 
        //catch (DocumentException ex){} 
        catch (IOException ex){}
    
        
    }//end of controller method */
    
}
