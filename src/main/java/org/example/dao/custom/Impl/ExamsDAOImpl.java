package org.example.dao.custom.Impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.ExamsDAO;
import org.example.entity.Exams;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExamsDAOImpl implements ExamsDAO {
    public ArrayList<Exams> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<Exams> allExams = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM exam");


            while (rst.next()) {
                Exams exam = new Exams(rst.getString("exam_id"), rst.getString("exam_name"), rst.getString("date"), rst.getString("time"), rst.getString("lecturer_id"));
                allExams.add(exam);
            }
        return allExams;
    }

    public boolean add(Exams entity) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO exam VALUES(?,?,?,?,?)", entity.getExamID(), entity.getExamName(), entity.getDate(), entity.getTime(), entity.getLectureID());
    }

    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM exam WHERE exam_id = ?", id);
    }
    public boolean update(String examID, String examName, String date, String time, String lectureID) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE exam SET exam_id = ?,exam_name = ?, date = ?, time = ?, lecturer_id = ?  WHERE exam_id = ?", examID, examName, date, time, lectureID, examID);
    }
    public Exams examIdCheck(String examID) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM exam WHERE exam_id = ?", examID);
        return new Exams(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5));
    }

    @Override
    public boolean generateNewID() throws SQLException, ClassNotFoundException {
        return false;
    }

}
