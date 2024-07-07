package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExamsDTO implements Serializable {
    private String examID;
    private String examName;
    private String Date;
    private String time;
    private String lectureID ;
}
