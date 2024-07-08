package org.example.controller.DeleteController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.bo.BOFactory;
import org.example.bo.custom.*;

import java.sql.SQLException;

public class DeleteFormController {

    DeleteAttendanceBO deleteAttendanceBO = (DeleteAttendanceBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Attendance);
    DeleteBatchBO deleteBatchBO = (DeleteBatchBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Batch);
    DeleteCoursesBO deleteCoursesBO = (DeleteCoursesBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Courses);
    DeleteEmployeeBO deleteEmployeeBO = (DeleteEmployeeBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Employes);
    DeleteExamBO deleteExamBO = (DeleteExamBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Exams);
    DeleteLectureBO deleteLectureBO = (DeleteLectureBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Lecture);
    DeletePaymentBO deletePaymentBO = (DeletePaymentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Payment);
    DeleteStudentBO deleteStudentBO = (DeleteStudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Student);
    DeleteScheduleBO deleteScheduleBO = (DeleteScheduleBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Delete_Schedule);

    @FXML
    private TextField txtId;

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        String id = txtId.getText();

        try {
            boolean isDeleted = deleteAttendanceBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "lecturer deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteBatchBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Student deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteCoursesBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Batch deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteEmployeeBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Employee deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteExamBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Exam deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteLectureBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Payment deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deletePaymentBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Schedule deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteScheduleBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Attendance deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            boolean isDeleted = deleteStudentBO.delete(id);
            if (isDeleted) {
                new Alert(Alert.AlertType.CONFIRMATION, "Attendance deleted!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    }


