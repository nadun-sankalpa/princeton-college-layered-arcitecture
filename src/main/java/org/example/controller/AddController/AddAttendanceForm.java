package org.example.controller.AddController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.custom.AddAttendanceBO;
import org.example.bo.custom.Impl.AddAttendanceBOImpl;
import org.example.entity.Attendance;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class AddAttendanceForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtAttendanceId;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtInTime;

    @FXML
    private TextField txtOutTime;

    @FXML
    private TextField txtStudentName;

    @FXML
    private TextField txtUserId;

    AddAttendanceBO addAttendanceBO = new AddAttendanceBOImpl();

    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String attendance_id = txtAttendanceId.getText();
        String student_name = txtStudentName.getText();
        String date = txtDate.getText();
        String in_time = txtInTime.getText();
        String out_time = txtOutTime.getText();
        String user_id = txtUserId.getText();

        Attendance attendance = addAttendanceBO.attendanceIdCheck(attendance_id);
        if (attendance != null && attendance.getAttendanceID().equals(attendance_id)) {
            new Alert(Alert.AlertType.ERROR, "Attendance ID already exists!").show();
        } else {
            boolean isAdded = addAttendanceBO.add(new Attendance(attendance_id, student_name, date, in_time, out_time, user_id));
            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Attendance saved!").show();
            } else {
                new Alert(Alert.AlertType.ERROR, "Something went wrong!").show();
            }
        }
    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/attendance_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Attendance Form");
        stage.centerOnScreen();

    }
}

