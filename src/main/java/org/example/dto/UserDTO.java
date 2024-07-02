package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO implements Serializable {
    private String userId;
    private String userName;
    private String contactNumber;
    private String password;
    private String address;
}
