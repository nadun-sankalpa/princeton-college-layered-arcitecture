package org.example.controller.EditController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.bo.BOFactory;
import org.example.bo.custom.EditBatchBO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditBatchForm {
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


    EditBatchBO editBatchBO = (EditBatchBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Edit_Batch);

    @FXML
    void btnEditOnAction(ActionEvent event) {
        String batch_id = txtBatchId.getText();
        String name = txtBatchName.getText();
        String no_students = txtNoStudents.getText();
        String no_lecturers = txtNoLecturers.getText();
        String main_lecturer = txtMainLecturer.getText();
        String batch_representer = txtBatchRepresenter.getText();



        try {
            boolean isUpdated = editBatchBO.update(batch_id, name, no_students, no_lecturers, main_lecturer, batch_representer);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Batch updated!").show();
                txtBatchId.setText("");
                txtBatchName.setText("");
                txtNoStudents.setText("");
                txtNoLecturers.setText("");
                txtMainLecturer.setText("");
                txtBatchRepresenter.setText("");
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
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/Batch_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Batch Form");
        stage.centerOnScreen();

    }
}
