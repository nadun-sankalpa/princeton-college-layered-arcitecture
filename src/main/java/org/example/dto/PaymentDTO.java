package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PaymentDTO  implements Serializable {
    private String paymentId;
    private String Date;
    private String Amount;
    private String studentId;
    private String userId;
    private String courseID;
}
