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
import org.example.bo.custom.CoursesBO;
import org.example.entity.Courses;
import org.example.view.tdm.CoursesTm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CoursesFormController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TableColumn<?, ?> colCourseFee;

    @FXML
    private TableColumn<?, ?> colCourseId;

    @FXML
    private TableColumn<?, ?> colCourseName;

    @FXML
    private TableColumn<?, ?> colDuration;

    @FXML
    private TableColumn<?, ?> colMainLecturer;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<Courses> tblCourse;

    private List<CoursesTm> coursesList = new ArrayList<CoursesTm>();

    CoursesBO coursesBO = (CoursesBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.Course);

    public void initialize() throws SQLException, ClassNotFoundException {
        setCellValueFactory();
        loadCourseTable();
    }
    public void loadCourseTable() throws SQLException, ClassNotFoundException {
        ObservableList<Courses> tmList = FXCollections.observableArrayList(coursesBO.getAll());
        for (Courses c :tmList){
          CoursesTm coursesTm = new CoursesTm(
                  c.getCourseID(),
                  c.getCourseName(),
                  c.getCourseDuration(),
                  c.getMainLecturer(),
                  c.getCourseFee()
          );
          coursesList.add(coursesTm);
        }
        tblCourse.setItems(tmList);
    }
    private void setCellValueFactory() {

        colCourseId.setCellValueFactory(new PropertyValueFactory<>("courseID"));
        colCourseName.setCellValueFactory(new PropertyValueFactory<>("courseName"));
        colCourseFee.setCellValueFactory(new PropertyValueFactory<>("courseFee"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("courseDuration"));
        colMainLecturer.setCellValueFactory(new PropertyValueFactory<>("mainLecturer"));
    }
    @FXML
    void btnAddCourseOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/addCourse_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Add Course Form");
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
    void btnDeleteCourseOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/org.example/delete_form.fxml"));

        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Delete Form");

        stage.show();

    }

    @FXML
    void btnEditCourseOnAction(ActionEvent event) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/org.example/editCourse_form.fxml"));
        Stage stage = (Stage) rootNode.getScene().getWindow();

        stage.setScene(new Scene(anchorPane));
        stage.setTitle("Edit Course Form");
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
