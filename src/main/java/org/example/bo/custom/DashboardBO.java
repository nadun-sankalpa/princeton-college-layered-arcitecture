package org.example.bo.custom;

import javafx.scene.chart.XYChart;
import org.example.bo.SuperBO;

import java.sql.SQLException;

public interface DashboardBO extends SuperBO {
    public  XYChart.Series IncomeChart(XYChart.Series chart);
    public int getLecturerCount() throws SQLException, ClassNotFoundException;
    public int getBatchCount() throws SQLException, ClassNotFoundException;
    public int getEmployeeCount() throws SQLException, ClassNotFoundException;
    public int getStudentCount() throws SQLException, ClassNotFoundException;
}
