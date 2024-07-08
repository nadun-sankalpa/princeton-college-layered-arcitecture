package org.example.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.bo.BOFactory;
import org.example.bo.custom.DashboardBO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

public class DashboardFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label lblBatchCount;

    @FXML
    private Label lblEmployeCount;

    @FXML
    private Label lblLecturerCount;

    @FXML
    private Label lblStudentCount;

    @FXML
    private AnchorPane rootNode;

    DashboardBO dashboardBO = (DashboardBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Dashboard);

    public void initialize() {

        try {
            int studentCount = dashboardBO.getStudentCount();
            setStudentCount(studentCount);

            int lecturerCount = dashboardBO.getLecturerCount();
            setLecturerCount(lecturerCount);

            int batchCount = dashboardBO.getBatchCount();
            setBatchCount(batchCount);

            int employeCount = dashboardBO.getEmployeeCount();
            setEmployeCount(employeCount);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



    private void setStudentCount(int studentCount){lblStudentCount.setText(String.valueOf(studentCount));}

    private void setEmployeCount(int employeCount) {lblEmployeCount.setText(String.valueOf(employeCount));}

    private void setBatchCount(int batchCount) {lblBatchCount.setText(String.valueOf(batchCount));}

    private void setLecturerCount(int lecturerCount) {
        lblLecturerCount.setText(String.valueOf(lecturerCount));
    }


    @FXML
     void btnAttendanceOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/Attendance_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Attendance Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnExamsOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/exams_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Exams Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnScheduleOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/schedule_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Schedule Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnLogOutOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/org.example/login_form.fxml")));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Form");
    }
    @FXML
     void btnPaymentOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/payment_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Payment Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnBatchesOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/Batch_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Batch Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnCoursesOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/courses_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Course Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnEmployesOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/employes_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Employe Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnStudentsOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/student_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Student Form");
        stage.centerOnScreen();
    }
    @FXML
     void btnLecturersOnAction(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/lecturer_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Lecturer Form");
        stage.centerOnScreen();
    }
}
