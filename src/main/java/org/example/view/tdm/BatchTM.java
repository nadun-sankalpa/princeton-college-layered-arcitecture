package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BatchTM implements Comparable<BatchTM> {
    private String batchID;
    private String batchName;
    private String noOfStudents;
    private String noOfLecturers;
    private String mainLecturer;
    private String batchRepresenter;

    @Override
    public int compareTo(BatchTM o) {
        return this.getBatchName().compareTo(o.getBatchName());
    }
}
