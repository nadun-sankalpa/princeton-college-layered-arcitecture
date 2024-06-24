package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScheduleTM implements Comparable<ScheduleTM> {
    private String ScheduleID;
    private String ModuleName;
    private String Date;
    private String Time;
    private String LecturerID;

    @Override
    public int compareTo(ScheduleTM o) {
        return this.getModuleName().compareTo(o.getModuleName());
    }
}
