package org.example.dao;

import org.example.dao.custom.Impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public enum DAOTypes{
        Attendance,Batch,Course,Employes,Exams,Lecture,Payment,Schedule, STUDENT, ATTENDANCE, BATCH, COURSES, EMPLOYEES, EXAMS, LECTURER, PAYMENT, SCHEDULE, Student
    }


    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case Attendance:
                return new AttendanceDAOImpl();
            case Batch:
                return new BatchDAOImpl();
            case Course:
                return new CoursesDAOImpl();
            case Employes:
                return new EmployesDAOImpl();
            case Exams:
                return new ExamsDAOImpl();
            case Lecture:
                return new LecturerDAOImpl();
            case Payment:
                return new PaymentDAOImpl();
            case Schedule:
                return new ScheduleDAOImpl();
            case Student:
                return new StudentDAOImpl();
            default:
                return null;
        }

    }

}
