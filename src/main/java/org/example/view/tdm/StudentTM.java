package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentTM implements Comparable<StudentTM> {
    private String studentID;
    private String name;
    private String contactNo;
    private String address;
    private String nicNo;
    private String userID;
    @Override
    public int compareTo(StudentTM o) {return this.studentID.compareTo(o.getStudentID());
    }
}
