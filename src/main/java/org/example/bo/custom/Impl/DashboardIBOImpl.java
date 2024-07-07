package org.example.bo.custom.Impl;

import javafx.scene.chart.XYChart;
import org.example.bo.custom.DashboardBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.*;

import java.sql.SQLException;

public class DashboardIBOImpl implements DashboardBO {
    BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Batch);
StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Student);
EmployesDAO employesDAO = (EmployesDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Employes);
    LecturerDAO lecturerDAO = (LecturerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Lecture);
    PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Payment);

    public  XYChart.Series IncomeChart(XYChart.Series chart) {
        return paymentDAO.IncomeChart(chart);
    }

public int getLecturerCount() throws SQLException, ClassNotFoundException {
        return lecturerDAO.getLecturerCount();
    }

public int getBatchCount() throws SQLException, ClassNotFoundException {
        return batchDAO.getBatchCount();
    }

public int getEmployeeCount() throws SQLException, ClassNotFoundException {
        return employesDAO.getEmployeeCount();
    }
    public int getStudentCount() throws SQLException, ClassNotFoundException {
        return studentDAO.getStudentCount();
    }
}
