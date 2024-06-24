package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoursesDTO implements Serializable {
    private String courseId;
    private String courseName;
    private String courseFee;
    private String duration;
    private String mainLecturer;
}
