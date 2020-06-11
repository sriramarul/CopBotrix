package com.example.bprdrelief;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import java.util.ArrayList;
import java.util.List;

public class ReportActivity extends AppCompatActivity {
    AnyChartView anyChartView;

    String[] desc = {"Rape", "Murder", "Riots", "Burglary", "Violation"};
    double[] score = {8.5, 5.8, 4.4, 2.9, 2.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        anyChartView = findViewById(R.id.any_chart_view);
        setupPieChart();

    }
    public void setupPieChart(){
        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>( );

        for(int i=0; i<desc.length; i++){
            dataEntries.add(new ValueDataEntry(desc[i], score[i]));
        }
        pie.data(dataEntries);
        anyChartView.setChart(pie);
    }


}
