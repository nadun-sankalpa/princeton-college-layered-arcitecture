package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.example.bo.custom.Impl.LoginBOImpl;
import org.example.bo.custom.LoginBO;
import org.example.entity.User;

import java.io.IOException;
import java.sql.SQLException;

public class LoginFormController {

    @FXML
    private JFXButton btnLogin;

    @FXML
    private Text loginTxt;

    @FXML
    private TextField txtUserId;

    @FXML
    private TextField txtPassword;

    @FXML
    private AnchorPane rootNode;

    LoginBO loginBO = new LoginBOImpl();

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userId = txtUserId.getText();
        String pw = txtPassword.getText();

        try {
            User user = loginBO.checkCredential(userId, pw);
            if (user.getUserId().equals(userId)) {
                String dbpw = user.getPassword();

                if (dbpw.equals(pw)) {
                    navigateToTheDashboard();
                } else {
                    new Alert(Alert.AlertType.ERROR, "Password is incorrect!").show();
                }
                }else {
                    new Alert(Alert.AlertType.ERROR, "User Id is incorrect!").show();

                }
            } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, "Something went wrong!").show();
            throw new RuntimeException(e);
        }

    }


    private void navigateToTheDashboard() throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/org/example/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
        stage.show();
    }
    public void linkRegistrationOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/org/example/registration_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Registration Form");

        stage.show();
    }

}
