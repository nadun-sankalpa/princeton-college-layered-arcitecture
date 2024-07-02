package org.example.controller.EditController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.dao.custom.Impl.PaymentDAOImpl;
import org.example.entity.Payment;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class EditPaymentForm {
    @FXML
    private AnchorPane rootNode;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtCourseId;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtPaymentId;

    @FXML
    private TextField txtStudentId;

    @FXML
    private TextField txtUserID;
    @FXML
    void btnEditOnAction(ActionEvent event) {
        String payment_id = txtPaymentId.getText();
        String amount = txtAmount.getText();
        String date = txtDate.getText();
        String student_id = txtStudentId.getText();
        String user_id = txtUserID.getText();
        String course_id = txtCourseId.getText();

        Payment payment = new Payment(payment_id, amount,date,student_id,user_id, course_id);

        try {
            boolean isUpdated = PaymentDAOImpl.update(payment);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Payment updated!").show();
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/payment_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Payment Form");
        stage.centerOnScreen();

    }
}
