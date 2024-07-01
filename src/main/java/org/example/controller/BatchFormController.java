package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class BatchFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TableColumn<?, ?> colBatchId;

    @FXML
    private TableColumn<?, ?> colBatchName;

    @FXML
    private TableColumn<?, ?> colBatchRepresenter;

    @FXML
    private TableColumn<?, ?> colMainLecturer;

    @FXML
    private TableColumn<?, ?> colNoOfLecturers;

    @FXML
    private TableColumn<?, ?> colNoOfStudents;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private AnchorPane rootNode1;

    @FXML
    private TableView<?> tblBatch;

    @FXML
    void btnAddBatchOnAction(ActionEvent event) {

    }

    @FXML
    void btnAttendanceOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/attendance_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Attendance Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnBatchesOnAction(ActionEvent event) {

    }

    @FXML
    void btnCorsesOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteBatchOnAction(ActionEvent event) {

    }

    @FXML
    void btnEditBatchOnAction(ActionEvent event) {

    }

    @FXML
    void btnEmployesOnAction(ActionEvent event) {

    }

    @FXML
    void btnExamsOnAction(ActionEvent event) {

    }

    @FXML
    void btnExitOnAction(ActionEvent event) {

    }

    @FXML
    void btnLecturersOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) {

    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {

    }

    @FXML
    void btnScheduleOnAction(ActionEvent event) {

    }

    @FXML
    void btnStudentsOnAction(ActionEvent event) {

    }

}
