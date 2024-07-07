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
import org.example.bo.custom.Impl.StudentBOImpl;
import org.example.bo.custom.StudentBO;
import org.example.entity.Student;
import org.example.view.tdm.StudentTM;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContactNo;

    @FXML
    private TableColumn<?, ?> colNicNumber;

    @FXML
    private TableColumn<?, ?> colStudentId;

    @FXML
    private TableColumn<?, ?> colStudentName;

    @FXML
    private TableColumn<?, ?> colUserId;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<Student> tblStudent;

    private List<StudentTM> studentList = new ArrayList<StudentTM>();

    StudentBO studentBO = new StudentBOImpl();

    public void initialize() throws SQLException, ClassNotFoundException {
        setCellValueFactory();
        loadStudentTable();
    }

    public void loadStudentTable() throws SQLException, ClassNotFoundException {
        ObservableList<Student> tmList = FXCollections.observableArrayList(studentBO.getAll());
        for (Student s : tmList) {
            StudentTM studentTM = new StudentTM(
                    s.getStudentID(),
                    s.getName(),
                    s.getContactNo(),
                    s.getNicNo(),
                    s.getAddress(),
                    s.getUserID()
            );
            studentList.add(studentTM);

        }
        tblStudent.setItems(tmList);
    }

    private void setCellValueFactory(){
        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentID"));
        colStudentName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colContactNo.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        colNicNumber.setCellValueFactory(new PropertyValueFactory<>("nicNo"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colUserId.setCellValueFactory(new PropertyValueFactory<>("userID"));
    }


    @FXML
    void btnAddStudentOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/addStudent_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Add Student Form");
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
    void btnDeleteStudentOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/delete_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Delete Form");

        stage.show();

    }

    @FXML
    void btnEditStudentOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/editStudent_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Edit Student Form");
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
