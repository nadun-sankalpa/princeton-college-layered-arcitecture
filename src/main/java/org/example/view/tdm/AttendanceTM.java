package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AttendanceTM implements Comparable<AttendanceTM> {
    private String AttendanceID;
    private String StudentName;
    private String Date;
    private String InTime;
    private String OutTime;
    private String UserId;

    @Override
    public int compareTo(AttendanceTM o) {
        return this.getStudentName().compareTo(o.getStudentName());
    }
}
