package lastfxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

public class UI2Controller implements Initializable {

    @FXML private Label lineChartLabel;
    @FXML private Button loadLineChartButton;
    @FXML private LineChart<String, Number> lineChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadLineChartButtonOnClick(ActionEvent event) {
        lineChart.getData().clear();
        XYChart.Series<String,Number> series1 = new XYChart.Series<String,Number>();
        series1.getData().add(new XYChart.Data<String,Number>("Jan",200));
        series1.getData().add(new XYChart.Data<String,Number>("Feb",500));
        series1.getData().add(new XYChart.Data<String,Number>("Mar",300));
        series1.getData().add(new XYChart.Data<String,Number>("Apr",600));
        series1.setName("Pay-1");
        
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        series2.getData().add(new XYChart.Data<String,Number>("Jan",400));
        series2.getData().add(new XYChart.Data<String,Number>("Feb",100));
        series2.getData().add(new XYChart.Data<String,Number>("Mar",800));
        series2.getData().add(new XYChart.Data<String,Number>("Apr",500));
        series2.setName("Pay-2");
        
        XYChart.Series<String,Number> series3 = new XYChart.Series<String,Number>();
        series3.getData().add(new XYChart.Data<String,Number>("Jan",500));
        series3.getData().add(new XYChart.Data<String,Number>("Feb",900));
        series3.getData().add(new XYChart.Data<String,Number>("Mar",450));
        series3.getData().add(new XYChart.Data<String,Number>("Apr",650));
        series3.setName("Pay-3");
        
        lineChart.getData().addAll(series1,series2,series3);
        
        for(XYChart.Data<String,Number> data: series1.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    lineChartLabel.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
        for(XYChart.Data<String,Number> data: series2.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    lineChartLabel.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
        for(XYChart.Data<String,Number> data: series3.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    lineChartLabel.setText("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue()));
                    Tooltip.install(data.getNode(),new Tooltip("X: "+String.valueOf(data.getXValue())+"\nY: "+String.valueOf(data.getYValue())));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
        }
    }
    
}
