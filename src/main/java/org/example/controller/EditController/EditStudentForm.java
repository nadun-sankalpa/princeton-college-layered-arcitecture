package org.example.controller.EditController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.dao.custom.Impl.StudentDAOImpl;
import org.example.entity.Student;

import java.sql.SQLException;

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

    @FXML
    void btnEditOnAction(ActionEvent event) {
        String student_id = txtStudentId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String cno = txtCno.getText();
        String nic_no = txtNicNo.getText();
        String user_id = txtUserId.getText();

        Student student = new Student(student_id, name, address, cno, nic_no, user_id);

        try {
            boolean isUpdated = StudentDAOImpl.update(student);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Student updated!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
