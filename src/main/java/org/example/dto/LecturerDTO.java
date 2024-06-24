package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LecturerDTO implements Serializable {
    private String userId;
    private String userName;
    private String nicNumber;
    private String contactNo;
    private String address;
}
