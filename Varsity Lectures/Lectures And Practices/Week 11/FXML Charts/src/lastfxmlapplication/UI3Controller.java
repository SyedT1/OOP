package lastfxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class UI3Controller implements Initializable {

    @FXML private BarChart<String, Number> barChart;
    @FXML private NumberAxis yAxis;
    @FXML private CategoryAxis xAxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.getData().add(new XYChart.Data<String,Number>("Farid",25));
        series.getData().add(new XYChart.Data<String,Number>("Shahed",150));
        series.getData().add(new XYChart.Data<String,Number>("Faria",160));
        series.getData().add(new XYChart.Data<String,Number>("Raihan",200));
        series.setName("Monthly Pay");
        barChart.getData().add(series);
    }    
    
}
