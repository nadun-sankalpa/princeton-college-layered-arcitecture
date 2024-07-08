package org.example.controller.AddController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.BOFactory;
import org.example.bo.custom.AddBatchBO;
import org.example.entity.Batch;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.regex.Pattern;

public class AddBatchForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtBatchId;

    @FXML
    private TextField txtBatchName;

    @FXML
    private TextField txtBatchRepresenter;

    @FXML
    private TextField txtMainLecturer;

    @FXML
    private TextField txtNoLecturers;

    @FXML
    private TextField txtNoStudents;
    AddBatchBO addBatchBO = (AddBatchBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Add_Batch);


    @FXML
    void txtBatchIdReleasedOnAction(KeyEvent event) {
        Pattern BatchIDPattern = Pattern.compile("^B\\d{3}$");
        if(!BatchIDPattern.matcher(txtBatchId.getText()).matches()){
            addError(txtBatchId);

        }else{
            removeError(txtBatchId);
        }

    }

    @FXML
    void txtBatchNameReleasedOnAction(KeyEvent event) {
        Pattern BatchNamePattern = Pattern.compile("^([A-z0-9]|[-/,.@+]|\\\\s){4,}$");
        if(!BatchNamePattern.matcher(txtBatchName.getText()).matches()){
            addError(txtBatchName);

        }else{
            removeError(txtBatchName);
        }

    }

    @FXML
    void txtBatchRepresenterReleasedOnAction(KeyEvent event) {
        Pattern BatchRepresenterPattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        if(!BatchRepresenterPattern.matcher(txtBatchRepresenter.getText()).matches()){
            addError(txtBatchRepresenter);

        }else{
            removeError(txtBatchRepresenter);
        }


    }

    @FXML
    void txtMainLecturerReleasedOnAction(KeyEvent event) {
        Pattern MainLecturerPattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        if(!MainLecturerPattern.matcher(txtMainLecturer.getText()).matches()){
            addError(txtMainLecturer);

        }else{
            removeError(txtMainLecturer);
        }


    }

    @FXML
    void txtNoLecturersReleasedOnAction(KeyEvent event) {
        Pattern NoLecturersPattern = Pattern.compile("^([0-9]|[1-9][0-9]|100)$");
        if(!NoLecturersPattern.matcher(txtNoLecturers.getText()).matches()){
            addError(txtNoLecturers);

        }else{
            removeError(txtNoLecturers);
        }


    }

    @FXML
    void txtNoStudentsReleasedOnAction(KeyEvent event) {
        Pattern NoStudentsPattern = Pattern.compile("^([0-9]|[1-9][0-9]|100)$");
        if(!NoStudentsPattern.matcher(txtNoStudents.getText()).matches()){
            addError(txtNoStudents);

        }else{
            removeError(txtNoStudents);
        }

    }
    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String batch_id = txtBatchId.getText();
        String name = txtBatchName.getText();
        String no_students = txtNoStudents.getText();
        String no_lecturers = txtNoLecturers.getText();
        String main_lecturer = txtMainLecturer.getText();
        String batch_representer = txtBatchRepresenter.getText();

        Pattern BatchIDPattern = Pattern.compile("^B\\d{3}$");
        Pattern BatchNamePattern = Pattern.compile("^([A-z0-9]|[-/,.@+]|\\\\s){4,}$");
        Pattern BatchRepresenterPattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        Pattern MainLecturerPattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        Pattern NoLecturersPattern = Pattern.compile("^([0-9]|[1-9][0-9]|100)$");
        Pattern NoStudentsPattern = Pattern.compile("^([0-9]|[1-9][0-9]|100)$");

        if (isValidInput(BatchIDPattern,BatchNamePattern,BatchRepresenterPattern,MainLecturerPattern,NoLecturersPattern,NoStudentsPattern)) {

            Batch batch = addBatchBO.batchIdCheck(batch_id);
            if (batch != null && batch.getBatchID().equals(batch_id)) {
                new Alert(Alert.AlertType.ERROR, "Batch ID already exists!").show();
            } else {
                boolean isAdded = addBatchBO.add(new Batch(batch_id, name, no_lecturers, no_students, main_lecturer, batch_representer));
                if (isAdded) {
                    new Alert(Alert.AlertType.INFORMATION, "Batch Added Successfully").show();
                } else {
                    new Alert(Alert.AlertType.ERROR, "Something went wrong!").show();
                }
            }

        }


    }

    private boolean isValidInput(Pattern batchIDPattern, Pattern batchNamePattern, Pattern batchRepresenterPattern, Pattern mainLecturerPattern, Pattern noLecturersPattern, Pattern noStudentsPattern) {
        boolean isValid = true;
        if(!batchIDPattern.matcher(txtBatchId.getText()).matches()){
            addError(txtBatchId);
            isValid =false;

        }else{
            removeError(txtBatchId);
        }

        if(!batchNamePattern.matcher(txtBatchName.getText()).matches()){
            addError(txtBatchName);
            isValid = false;

        }else{
            removeError(txtBatchName);
        }
        if(!batchRepresenterPattern.matcher(txtBatchRepresenter.getText()).matches()){
            addError(txtBatchRepresenter);
            isValid = false;

        }else{
            removeError(txtBatchRepresenter);
        }
        if(!mainLecturerPattern.matcher(txtMainLecturer.getText()).matches()){
            addError(txtMainLecturer);
            isValid = false;

        }else{
            removeError(txtMainLecturer);
        }
        if(!noLecturersPattern.matcher(txtNoLecturers.getText()).matches()){
            addError(txtNoLecturers);
            isValid = false;

        }else{
            removeError(txtNoLecturers);
        }
        if(!noStudentsPattern.matcher(txtNoStudents.getText()).matches()){
            addError(txtNoStudents);
            isValid = false;

        }else{
            removeError(txtNoStudents);
        }
        return isValid;
    }



    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/Batch_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Batch Form");
        stage.centerOnScreen();

    }
    private void removeError(TextField textField) {
        textField.setStyle("-fx-border-color: green");

    }

    private void addError(TextField textField) {
        textField.setStyle("-fx-border-color: red");
    }
}
