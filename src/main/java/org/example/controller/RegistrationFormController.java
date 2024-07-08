package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import org.example.bo.BOFactory;
import org.example.bo.custom.RegistrationBO;
import org.example.entity.User;

import java.sql.SQLException;
import java.util.regex.Pattern;

public class RegistrationFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCno;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPw;

    @FXML
    private TextField txtUserId;
    RegistrationBO registrationBO = (RegistrationBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Registration);

    @FXML
    void txtCnoOnKeyReleasedAction(KeyEvent event) {
        Pattern phonePattern = Pattern.compile( "^([+]94{1,3}|[0])([1-9]{2})([0-9]){7}$");
        if(!phonePattern.matcher(txtCno.getText()).matches()){
            addError(txtCno);

        }else{
            removeError(txtCno);
        }

    }

    @FXML
    void txtUserIdReleaseOnAction(KeyEvent event) {
        Pattern IDPattern = Pattern.compile("^U\\d{3}$");
        if(!IDPattern.matcher(txtUserId.getText()).matches()){
            addError(txtUserId);

        }else{
            removeError(txtUserId);
        }

    }

    @FXML
    void btnRegister(ActionEvent event) throws SQLException, ClassNotFoundException {
        String user_id = txtUserId.getText();
        String name = txtName.getText();
        String pw = txtPw.getText();
        String address = txtAddress.getText();
        String cno = txtCno.getText();

        Pattern phonePattern = Pattern.compile( "^([+]94{1,3}|[0])([1-9]{2})([0-9]){7}$");
        Pattern IDPattern = Pattern.compile("^U\\d{3}$");
        if (isValidInput(IDPattern,phonePattern)) {

            User user = registrationBO.checkCredential(user_id, pw);
            if (user != null && user.getUserId().equals(user_id)) {
                new Alert(Alert.AlertType.ERROR, "User ID already exists!").show();
            }else {
                boolean isAdded = registrationBO.add(new User(user_id, name, pw, address, cno));
                if (isAdded) {
                    new Alert(Alert.AlertType.CONFIRMATION, "Successfully Added").show();
                } else {
                    new Alert(Alert.AlertType.WARNING, "Something went wrong").show();
                }
            }
        }

    }

    private boolean isValidInput(Pattern idPattern, Pattern phonePattern) {
        boolean isValid = true;
        if(!idPattern.matcher(txtUserId.getText()).matches()){
            addError(txtUserId);
            isValid =false;

        }else{
            removeError(txtUserId);
        }

        if(!phonePattern.matcher(txtCno.getText()).matches()){
            addError(txtCno);
            isValid = false;

        }else{
            removeError(txtCno);
        }
        return isValid;
    }


    private void removeError(TextField textField) {
        textField.setStyle("-fx-border-color: green");

    }

    private void addError(TextField textField) {
        textField.setStyle("-fx-border-color: red");
    }


}