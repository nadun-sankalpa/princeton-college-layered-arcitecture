package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentTM implements Comparable<StudentTM> {
    private String ScheduleID;
    private String ModuleName;
    private String Date;
    private String Time;
    private String LecturerID;

    @Override
    public int compareTo(StudentTM o) {
        return this.getModuleName().compareTo(o.getModuleName());
    }
}
