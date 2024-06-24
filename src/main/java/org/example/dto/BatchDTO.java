package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchDTO implements Serializable {
    private String batchId;
    private String batchName;
    private String batchRepresenter;
    private String mainLecturer;
    private String noOfLecturers;
    private String noOfStudents;
}
