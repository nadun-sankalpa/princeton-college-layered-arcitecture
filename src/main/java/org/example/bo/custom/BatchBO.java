package org.example.bo.custom;

import org.example.entity.Batch;

import java.sql.SQLException;
import java.util.ArrayList;

public interface BatchBO {
    public ArrayList<Batch> getAll() throws SQLException, ClassNotFoundException;
}
