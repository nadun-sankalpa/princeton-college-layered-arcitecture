package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CoursesTm implements Comparable<CoursesTm> {
    private String CourseID;
    private String CourseName;
    private String Duration;
    private String MainLecturer;
    private String CourseFee;

    @Override
    public int compareTo(CoursesTm o) {
        return this.getCourseName().compareTo(o.getCourseName());
    }
}
