package org.example.controller.DeleteController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.bo.custom.*;
import org.example.bo.custom.Impl.*;

import java.sql.SQLException;

public class DeleteFormController {

    DeleteAttendanceBO deleteAttendanceBO = new DeleteAttendanceBOImpl();
    DeleteBatchBO deleteBatchBO = new DeleteBatchBOImpl();
    DeleteCoursesBO deleteCoursesBO = new DeleteCoursesBOImpl();
    DeleteEmployeeBO deleteEmployeeBO = new DeleteEmployeeBOImpl();
    DeleteExamBO deleteExamBO = new DeleteExamBOImpl();
    DeleteLectureBO deleteLectureBO = new DeleteLecturerBOImpl();
    DeletePaymentBO deletePaymentBO = new DeletePaymentBOImpl();
    DeleteStudentBO deleteStudentBO = new DeleteStudentBOImpl();
    DeleteScheduleBO deleteScheduleBO = new DeleteScheduleBOImpl();


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


