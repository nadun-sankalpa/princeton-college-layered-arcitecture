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
    private String paymentDate;
    private String paymentAmount;
    private String paymentMethod;
    private String userId;
}
