package org.example.bo.custom;

import javafx.scene.chart.XYChart;

import java.sql.SQLException;

public interface DashboardBO {
    public  XYChart.Series IncomeChart(XYChart.Series chart);
    public int getLecturerCount() throws SQLException, ClassNotFoundException;
    public int getBatchCount() throws SQLException, ClassNotFoundException;
    public int getEmployeeCount() throws SQLException, ClassNotFoundException;
    public int getStudentCount() throws SQLException, ClassNotFoundException;
}
