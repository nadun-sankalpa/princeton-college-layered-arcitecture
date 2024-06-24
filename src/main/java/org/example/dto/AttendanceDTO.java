package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttendanceDTO implements Serializable {
    private String attendanceId;
    private String date;
    private String inTime;
    private String outTime;
    private String studentName;
    private String userId;

}
