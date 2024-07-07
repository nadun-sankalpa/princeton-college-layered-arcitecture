package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExamTM implements Comparable<ExamTM> {
    private String ExamID;
    private String ExamName;
    private String Date;
    private String Time;
    private String LecturerID;

    @Override
    public int compareTo(ExamTM o) {
        return this.getExamID().compareTo(o.getExamName());
    }
}

