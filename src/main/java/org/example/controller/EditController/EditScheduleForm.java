package org.example.controller.EditController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.custom.EditScheduleBO;
import org.example.bo.custom.Impl.Edit_Impl.EditScheduleBOImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditScheduleForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtLecturerId;

    @FXML
    private TextField txtModuleName;

    @FXML
    private TextField txtTime;

    @FXML
    private TextField txtscheduleId;

    EditScheduleBO editScheduleBO = new EditScheduleBOImpl();
    @FXML
    void btnEditOnAction(ActionEvent event) {
        String schedule_id = txtscheduleId.getText();
        String name = txtModuleName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        String lecturer_id = txtLecturerId.getText();

        try {
            boolean isUpdated = editScheduleBO.update(schedule_id, name, date, time, lecturer_id);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Schedule updated!").show();
                txtscheduleId.setText("");
                txtModuleName.setText("");
                txtDate.setText("");
                txtTime.setText("");
                txtLecturerId.setText("");
            }else {
                new Alert(Alert.AlertType.ERROR, "Something went wrong!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/schedule_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Schedule Form");
        stage.centerOnScreen();

    }

}
