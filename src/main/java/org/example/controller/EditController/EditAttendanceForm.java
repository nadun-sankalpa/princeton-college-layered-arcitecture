package org.example.controller.EditController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.custom.EditAttendanceBO;
import org.example.bo.custom.Impl.Edit_Impl.EditAttendanceBOImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditAttendanceForm {
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

    EditAttendanceBO editAttendanceBO = new EditAttendanceBOImpl();
    @FXML
    void btnEditOnAction(ActionEvent event) {
        String attendance_id = txtAttendanceId.getText();
        String student_name = txtStudentName.getText();
        String date = txtDate.getText();
        String in_time = txtInTime.getText();
        String out_time = txtOutTime.getText();
        String user_id = txtUserId.getText();



        try {
            boolean isUpdated = editAttendanceBO.update(attendance_id,student_name, date, in_time, out_time, user_id);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Attendance updated!").show();
                txtAttendanceId.setText("");
                txtStudentName.setText("");
                txtDate.setText("");
                txtInTime.setText("");
                txtOutTime.setText("");
                txtUserId.setText("");
            }else {
                new Alert(Alert.AlertType.WARNING, "Something went wrong!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/attendance_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Attendance Form");
        stage.centerOnScreen();

    }

}
