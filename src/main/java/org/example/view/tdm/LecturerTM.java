package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class LecturerTM implements Comparable<LecturerTM> {
    private String LecturerID;
    private String LecturerName;
    private String contactNumber;
    private String Address;
    private String NicNumber;

    @Override
    public int compareTo(LecturerTM o) {
        return this.getLecturerName().compareTo(o.getLecturerName());
    }
}
