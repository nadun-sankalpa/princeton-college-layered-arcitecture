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
import org.example.bo.custom.ScheduleBO;
import org.example.entity.Schedule;
import org.example.view.tdm.ScheduleTM;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScheduleFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colLecturerId;

    @FXML
    private TableColumn<?, ?> colModuleName;

    @FXML
    private TableColumn<?, ?> colScheduleId;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<Schedule> tblSchedule;

    private List<ScheduleTM> scheduleList = new ArrayList<ScheduleTM>();

    ScheduleBO scheduleBO = (ScheduleBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Schedule);

    public void initialize() throws SQLException, ClassNotFoundException {
        setCellValueFactory();
        loadScheduleTable();
    }

    public void loadScheduleTable() throws SQLException, ClassNotFoundException {
        ObservableList<Schedule> tmList = FXCollections.observableArrayList(scheduleBO.getAll());
        for (Schedule schedule : tmList) {
            ScheduleTM scheduleTM = new ScheduleTM(
                    schedule.getScheduleID(),
                    schedule.getLecturerID(),
                    schedule.getModuleName(),
                    schedule.getDate(),
                    schedule.getTime()
            ); scheduleList.add(scheduleTM);

        }
        tblSchedule.setItems(tmList);
    }
    private void setCellValueFactory(){
     colScheduleId.setCellValueFactory(new PropertyValueFactory<>("scheduleID"));
     colLecturerId.setCellValueFactory(new PropertyValueFactory<>("lecturerID"));
     colModuleName.setCellValueFactory(new PropertyValueFactory<>("moduleName"));
     colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
     colTime.setCellValueFactory(new PropertyValueFactory<>("time"));
    }

    @FXML
    void btnAddScheduleOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/addSchedule_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Add Schedule Form");
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
    void btnCorsesOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/courses_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Course Form");
        stage.centerOnScreen();
    }

    @FXML
    void btnDeleteScheduleOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/delete_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Delete Form");

        stage.show();

    }

    @FXML
    void btnEditScheduleOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/editSchedule_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Edit Schedule Form");
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
