package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExamsDTO implements Serializable {
    private String examId;
    private String examName;
    private String examDate;
    private String examTime;
    private String courseId;
    private String batchId;
}
