package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchDTO implements Serializable {
    private String batchID;
    private String batchName;
    private String noOfStudents;
    private String noOfLecturers;
    private String mainLecturer;
    private String batchRepresenter;
}
