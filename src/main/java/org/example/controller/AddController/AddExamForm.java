package org.example.controller.AddController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.custom.AddExamBO;
import org.example.bo.custom.Impl.AddExamBOImpl;
import org.example.entity.Exams;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class AddExamForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtExamId;

    @FXML
    private TextField txtExamName;

    @FXML
    private TextField txtLecturerId;

    @FXML
    private TextField txtTime;

    AddExamBO addExamBO = new AddExamBOImpl();

    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String exam_id = txtExamId.getText();
        String name = txtExamName.getText();
        String date = txtDate.getText();
        String time = txtTime.getText();
        String lecturer_id = txtLecturerId.getText();


        Exams exam = addExamBO.examIdCheck(exam_id);
        if (exam != null && exam.getExamID().equals(exam_id)) {
            new Alert(Alert.AlertType.ERROR, "Exam ID already exists!").show();
        }else {
            boolean isAdded = addExamBO.add(new Exams(exam_id, name, date, time,lecturer_id));
            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Successfully Added").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Something went wrong").show();
            }
        }

    }



    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/exams_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Exam Form");
        stage.centerOnScreen();

    }



}
