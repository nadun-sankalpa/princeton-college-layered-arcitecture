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
import org.example.bo.custom.AddEmployeeBO;
import org.example.bo.custom.Impl.AddEmployeeBOImpl;
import org.example.entity.Employes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.regex.Pattern;

public class AddEmployeeForm {
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

    AddEmployeeBO addEmployeeBO = new AddEmployeeBOImpl() {



        @Override
        public Employes employeeIdCheck(String employeeID) throws SQLException, ClassNotFoundException {
            return null;
        }
    };

    @FXML
    void txtAddressReleasedOnAction(KeyEvent event) {
        Pattern adressPattern = Pattern.compile( "^([A-z0-9]|[-/,.@+]|\\\\s){4,}$");
        if(!adressPattern.matcher(txtAddress.getText()).matches()){
            addError(txtAddress);

        }else{
            removeError(txtAddress);
        }

    }

    @FXML
    void txtCnoReleasedOnAction(KeyEvent event) {
        Pattern phonePattern = Pattern.compile( "^([+]94{1,3}|[0])([1-9]{2})([0-9]){7}$");
        if(!phonePattern.matcher(txtContactNo.getText()).matches()){
            addError(txtContactNo);

        }else{
            removeError(txtContactNo);
        }

    }

    @FXML
    void txtEmployeeIdReleasedOnAction(KeyEvent event) {
        Pattern EmployeeIdPattern = Pattern.compile("^E\\d{3}$");
        if(!EmployeeIdPattern.matcher(txtEmployeeId.getText()).matches()){
            addError(txtEmployeeId);

        }else{
            removeError(txtEmployeeId);
        }

    }

    @FXML
    void txtNameReleasedOnAction(KeyEvent event) {
        Pattern NamePattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        if(!NamePattern.matcher(txtEmployeeName.getText()).matches()){
            addError(txtEmployeeName);

        }else{
            removeError(txtEmployeeName);
        }

    }

    @FXML
    void txtNicNoReleasedOnAction(KeyEvent event) {
        Pattern NicNoPattern = Pattern.compile("^([0-9]{9}[x|X|v|V]|[0-9]{10})$");
        if(!NicNoPattern.matcher(txtNicNo.getText()).matches()){
            addError(txtNicNo);

        }else{
            removeError(txtNicNo);
        }

    }


    @FXML
    void btnAddOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String employee_id = txtEmployeeId.getText();
        String name = txtEmployeeName.getText();
        String cno = txtContactNo.getText();
        String address = txtAddress.getText();
        String nic_no = txtNicNo.getText();

        Pattern adressPattern = Pattern.compile( "^([A-z0-9]|[-/,.@+]|\\\\s){4,}$");
        Pattern phonePattern = Pattern.compile( "^([+]94{1,3}|[0])([1-9]{2})([0-9]){7}$");
        Pattern EmployeeIdPattern = Pattern.compile("^E\\d{3}$");
        Pattern NamePattern = Pattern.compile("^[A-z|\\\\s]{3,}$");
        Pattern NicNoPattern = Pattern.compile("^([0-9]{9}[x|X|v|V]|[0-9]{10})$");

        if (isValidInput(adressPattern,phonePattern,EmployeeIdPattern,NamePattern,NicNoPattern)) {

             Employes employes = addEmployeeBO.employeeIdCheck(employee_id);
             if (employes.getEmployeeID().equals(employee_id)) {
                 new Alert(Alert.AlertType.ERROR, "Employee Id Already Exists").show();
             }else {
                 boolean isAdded = addEmployeeBO.add(new Employes(employee_id, name, cno, address, nic_no));
                 if (isAdded){
                 new Alert(Alert.AlertType.CONFIRMATION, "Employee Added Successfully").show();
             }else {
                 new Alert(Alert.AlertType.ERROR, "Something went wrong").show();
             }
             }


        }

    }

    private boolean isValidInput(Pattern adressPattern, Pattern phonePattern, Pattern EmployeeIdPattern, Pattern NamePattern, Pattern NicNoPattern) {
        boolean isValid = true;
        if(!adressPattern.matcher(txtAddress.getText()).matches()){
            addError(txtAddress);
            isValid =false;

        }else{
            removeError(txtAddress);
        }

        if(!phonePattern.matcher(txtContactNo.getText()).matches()){
            addError(txtContactNo);
            isValid = false;

        }else{
            removeError(txtContactNo);
        }

        if(!EmployeeIdPattern.matcher(txtEmployeeId.getText()).matches()){
            addError(txtEmployeeId);
            isValid = false;

        }else{
            removeError(txtEmployeeId);
        }

        if(!NicNoPattern.matcher(txtNicNo.getText()).matches()){
            addError(txtNicNo);
            isValid = false;

        }else{
            removeError(txtNicNo);
        }

        if(!NamePattern.matcher(txtEmployeeName.getText()).matches()){
            addError(txtEmployeeName);
            isValid = false;

        }else{
            removeError(txtEmployeeName);
        }

        return isValid;
    }




    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/employes_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Employee Form");
        stage.centerOnScreen();

    }
    private void removeError(TextField textField) {
        textField.setStyle("-fx-border-color: green");

    }

    private void addError(TextField textField) {
        textField.setStyle("-fx-border-color: red");
    }

}
