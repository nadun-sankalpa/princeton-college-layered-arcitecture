package org.example.controller.AddController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.custom.AddScheduleBO;
import org.example.bo.custom.Impl.AddScheduleBOImpl;
import org.example.entity.Schedule;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class AddScheduleForm {
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
    AddScheduleBO addScheduleBO = new AddScheduleBOImpl();
    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String schedule_id = txtscheduleId.getText();
        String name = txtModuleName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        String lecturer_id = txtLecturerId.getText();

        Schedule schedule = addScheduleBO.checkScheduleId(schedule_id);
        if (schedule.getScheduleID().equals(schedule_id)) {
            new Alert(Alert.AlertType.ERROR, "Schedule ID already exists!").show();
        } else {
            boolean isAdded = addScheduleBO.add(new Schedule(schedule_id, name, date, time, lecturer_id));

            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Schedule saved!").show();
            }else {
                new Alert(Alert.AlertType.ERROR, "Something happened!").show();
            }
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
