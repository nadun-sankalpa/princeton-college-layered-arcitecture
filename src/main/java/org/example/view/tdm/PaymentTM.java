package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentTM implements Comparable<PaymentTM> {
    private String paymentID;
    private String amount;
    private String Date;
    private String studentID;
    private String userID;
    private String courseID;

    @Override
    public int compareTo(PaymentTM o) {
        return this.getPaymentID().compareTo(o.getPaymentID());
    }
}
