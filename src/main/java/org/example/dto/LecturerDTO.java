package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LecturerDTO implements Serializable {
    private String LecturerID;
    private String LecturerName;
    private String contactNumber;
    private String Address;
    private String NicNumber;
}
