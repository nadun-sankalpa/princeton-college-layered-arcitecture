package org.example.dao.custom;

import org.example.dao.CrudDAO;

import java.sql.SQLException;

public interface AddStudentDAO extends CrudDAO<AddStudentDAO> {
    boolean add(AddStudentDAO entity) throws SQLException, ClassNotFoundException;
}
