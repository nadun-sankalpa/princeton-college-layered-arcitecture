package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RegistrationDTO implements Serializable {
    private String registrationId;
    private String registrationDate;
    private String userId;
    private String courseId;
    private String batchId;
}
