package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleDTO implements Serializable {
    private String scheduleId;
    private String scheduleDate;
    private String scheduleTime;
    private String courseId;
    private String batchId;
    private String examId;
}
