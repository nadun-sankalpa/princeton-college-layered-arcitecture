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
import org.example.bo.custom.EditStudentBO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditStudentForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCno;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtNicNo;

    @FXML
    private TextField txtStudentId;

    @FXML
    private TextField txtUserId;

    EditStudentBO editStudentBO = (EditStudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Edit_Student);

    @FXML
    void btnEditOnAction(ActionEvent event) {
        String student_id = txtStudentId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String cno = txtCno.getText();
        String nic_no = txtNicNo.getText();
        String user_id = txtUserId.getText();



        try {
            boolean isUpdated = editStudentBO.update(student_id, name, address, cno, nic_no, user_id);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Student updated!").show();
                txtStudentId.setText("");
                txtName.setText("");
                txtAddress.setText("");
                txtCno.setText("");
                txtNicNo.setText("");
                txtUserId.setText("");
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
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/student_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Schedule Form");
        stage.centerOnScreen();

    }
}
