package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployesDTO implements Serializable {
    private String employeId;
    private String employeName;
    private String nicNumber;
    private String contactNo;
    private String address;
}
