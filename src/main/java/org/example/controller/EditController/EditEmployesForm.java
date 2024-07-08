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
import org.example.bo.custom.EditEmployeeBO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditEmployesForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContactNo;

    @FXML
    private TextField txtEmployeeId;

    @FXML
    private TextField txtEmployeeName;

    @FXML
    private TextField txtNicNo;

    EditEmployeeBO editEmployeeBO = (EditEmployeeBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Edit_Employes);

    @FXML
    void btnEditOnAction(ActionEvent event) {
        String employee_id = txtEmployeeId.getText();
        String name = txtEmployeeName.getText();
        String cno = txtContactNo.getText();
        String address = txtAddress.getText();
        String nic_no = txtNicNo.getText();

        try {
            boolean isUpdated = editEmployeeBO.update(employee_id, name, cno, address, nic_no);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Employee updated!").show();
                txtEmployeeId.setText("");
                txtEmployeeName.setText("");
                txtContactNo.setText("");
                txtAddress.setText("");
                txtNicNo.setText("");
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
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/employes_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Employe Form");
        stage.centerOnScreen();

    }
}
