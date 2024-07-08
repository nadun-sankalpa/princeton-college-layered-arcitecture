package org.example.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.bo.BOFactory;
import org.example.bo.custom.AttendanceBO;
import org.example.entity.Attendance;
import org.example.view.tdm.AttendanceTM;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AttendanceFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TableColumn<?, ?> colAttendanceId;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colInTime;

    @FXML
    private TableColumn<?, ?> colOutTime;

    @FXML
    private TableColumn<?, ?> colStudentName;

    @FXML
    private TableColumn<?, ?> colUserId;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<Attendance> tblAttendance;

    private List<AttendanceTM> attendanceList = new ArrayList<AttendanceTM>();

    AttendanceBO attendanceBO = (AttendanceBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Attendance);

    public void initialize() throws SQLException, ClassNotFoundException {
        setCellValueFactory();
        loadAttendanceTable();
    }
    public void loadAttendanceTable() throws SQLException, ClassNotFoundException {
        ObservableList<Attendance> tmList = FXCollections.observableArrayList(attendanceBO.getAll());
        for (Attendance a : tmList) {
            AttendanceTM attendancetm = new AttendanceTM(
                    a.getAttendanceID(),
                    a.getStudentID(),
                    a.getIn_time(),
                    a.getOut_time(),
                    a.getDate(),
                    a.getUserID()
            );
            attendanceList.add(attendancetm);
        }

        tblAttendance.setItems(tmList);
    }
    private void setCellValueFactory() {

        colAttendanceId.setCellValueFactory(new PropertyValueFactory<>("attendanceID"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colInTime.setCellValueFactory(new PropertyValueFactory<>("in_time"));
        colOutTime.setCellValueFactory(new PropertyValueFactory<>("out_time"));
        colStudentName.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        colUserId.setCellValueFactory(new PropertyValueFactory<>("userID"));
    }

    @FXML
    void btnAddAttendanceOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/addAttendance_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Add Attendance Form");
        stage.centerOnScreen();


    }

    @FXML
    void btnAttendanceOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/attendance_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Attendance Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnBatchesOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/Batch_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Batch Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnCoursesOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/courses_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Course Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnDeleteAttendanceOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/delete_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Delete Form");

        stage.show();

    }

    @FXML
    void btnEditAttendanceOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/org.example/editAttendance_form.fxml")));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Edit Attendace Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnEmployesOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/employes_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Employe Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnExamsOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/exams_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Exams Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnExitOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Dashboard Form");
        stage.show();

    }

    @FXML
    void btnLecturersOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/lecturer_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Lecturer Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnLogOutOnAction(ActionEvent event) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Form");

    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/payment_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Payment Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnScheduleOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/schedule_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Schedule Form");
        stage.centerOnScreen();

    }

    @FXML
    void btnStudentsOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/student_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Student Form");
        stage.centerOnScreen();

    }

}
