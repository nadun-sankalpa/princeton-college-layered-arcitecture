package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DashboardDTO implements Serializable {
    private String totalLecturer;
    private String totalStudent;
    private String totalBatch;
    private String totalCourse;
}
