package org.example.controller.AddController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.example.bo.custom.AddPaymentBO;
import org.example.bo.custom.Impl.AddPaymentBOImpl;
import org.example.db.DbConnection;
import org.example.entity.Payment;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AddPaymentForm {
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
    AddPaymentBO addPaymentBO = new AddPaymentBOImpl();
    @FXML
    void btnAddOnAction(ActionEvent event) throws JRException, SQLException, ClassNotFoundException {
        String payment_id = txtPaymentId.getText();
        String amount = txtAmount.getText();
        String date = txtDate.getText();
        String student_id = txtStudentId.getText();
        String user_id = txtUserID.getText();
        String course_id = txtCourseId.getText();

        Payment payment = addPaymentBO.paymentIdCheck(payment_id);
        if (payment.getPaymentID().equals(payment_id)) {
            new Alert(Alert.AlertType.ERROR, "Payment ID already exists!").show();
        } else {
            boolean isAdded = addPaymentBO.add(new Payment(payment_id, amount, date, student_id, user_id, course_id));
            if (isAdded) {
                new Alert(Alert.AlertType.CONFIRMATION, "Payment added Successfully!").show();
            }else{
            new Alert(Alert.AlertType.ERROR, "Something happened!").show();
        }


        }

        JasperDesign jasperDesign =
                JRXmlLoader.load(getClass().getResourceAsStream("/Report/PaymentReport.jrxml"));

        JasperReport jasperReport =
                JasperCompileManager.compileReport(jasperDesign);

        Map<String, Object> data = new HashMap<>();
        data.put("CustomerID",txtStudentId.getText());
        data.put("NetTotal","3000");

        JasperPrint jasperPrint =
                JasperFillManager.fillReport(
                        jasperReport,
                        data,
                        DbConnection.getInstance().getConnection());

        JasperViewer.viewReport(jasperPrint,false);

    }


    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/payment_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Payment Form");
        stage.centerOnScreen();

    }
}
