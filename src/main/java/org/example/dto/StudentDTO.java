package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO implements Serializable {
    private String studentId;
    private String studentName;
    private String nicNumber;
    private String contactNo;
    private String address;
    private String userId;
}
