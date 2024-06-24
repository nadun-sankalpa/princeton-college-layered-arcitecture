package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchTM implements Comparable<BatchTM> {
    private String BatchID;
    private String BatchName;
    private String NoOfStudents;
    private String NoOfLecturers;
    private String MainLecturer;
    private String BatchRepresenter;

    @Override
    public int compareTo(BatchTM o) {
        return this.getBatchName().compareTo(o.getBatchName());
    }
}
