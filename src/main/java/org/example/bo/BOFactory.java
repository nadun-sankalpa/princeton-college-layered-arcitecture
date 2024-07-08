package org.example.bo;

import org.example.bo.custom.Impl.*;
import org.example.bo.custom.Impl.Edit_Impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static synchronized BOFactory getBOFactory() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public enum BOTypes {
        Add_Attendance,Add_Batch,Add_Courses,Add_Employee,Add_Exam,Add_Lecturer,Add_Payment,Add_Schedule,Add_Student,Attendance, Batch, Course, Employee, Exams, Lecturer, Payment, Schedule, Student, Edit_Attendance,Edit_Batch,Edit_Courses,Edit_Employes,Edit_Exams,Edit_Lecture,Edit_Payment,Edit_Schedule,Edit_Student,Delete_Attendance,Delete_Batch,Delete_Courses,Delete_Employes,Delete_Exams,Delete_Lecture,Delete_Payment,Delete_Schedule,Delete_Student,Login, Registration,Dashboard
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case Add_Attendance:
                return new AddAttendanceBOImpl();
            case Add_Batch:
                return new AddBatchBOImpl();
            case Add_Courses:
                return new AddCoursesBOImpl();
            case Add_Employee:
                return new AddEmployeeBOImpl();
            case Add_Exam:
                return new AddExamBOImpl();
            case Add_Lecturer:
                return new AddLecturerBOImpl();
            case Add_Payment:
                return new AddPaymentBOImpl();
            case Add_Schedule:
                return new AddScheduleBOImpl();
            case Add_Student:
                return new AddStudentBOImpl();
            case Attendance:
                return new AttendanceBOImpl();
            case Batch:
                return new BatchBOImpl();
            case Course:
                return new CoursesBOImpl();
            case Employee:
                return new EmployeeBOImpl();
            case Exams:
                return new ExamBOImpl();
            case Lecturer:
                return new LecturerBOImpl();
            case Payment:
                return new PaymentBOImpl();
            case Schedule:
                return new ScheduleBOImpl();
            case Student:
                return new StudentBOImpl();
            case Edit_Attendance:
                return new EditAttendanceBOImpl();
            case Edit_Batch:
                return new EditBatchBOImpl();
            case Edit_Courses:
                return new EditCoursesBOImpl();
            case Edit_Employes:
                return new EditEmployeeBOImpl();
            case Edit_Exams:
                return new EditExamBOImpl();
            case Edit_Lecture:
                return new EditLecturerBOImpl();
            case Edit_Payment:
                return new EditPaymentBOImpl();
            case Edit_Schedule:
                return new EditScheduleBOImpl();
            case Edit_Student:
                return new EditStudentBOImpl();
            case Delete_Attendance:
                return new DeleteAttendanceBOImpl();
            case Delete_Batch:
                return new DeleteBatchBOImpl();
            case Delete_Courses:
                return new DeleteCoursesBOImpl();
            case Delete_Employes:
                return new DeleteEmployeeBOImpl();
            case Delete_Exams:
                return new DeleteExamBOImpl();
            case Delete_Lecture:
                return new DeleteLecturerBOImpl();
            case Delete_Payment:
                return new DeletePaymentBOImpl();
            case Delete_Schedule:
                return new DeleteScheduleBOImpl();
            case Delete_Student:
                return new DeleteStudentBOImpl();
            case Login:
                return new LoginBOImpl();
            case Registration:
                return new RegistrationBOImpl();
            case Dashboard:
                return new DashboardIBOImpl();
            default:
                return null;
        }
    }

}
