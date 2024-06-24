package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentTM implements Comparable<PaymentTM> {
    String PaymentID;
    String Amount;
    String Date;
    String StudentID;
    String UserID;
    String CourseID;

    @Override
    public int compareTo(PaymentTM o) {
        return this.getPaymentID().compareTo(o.getPaymentID());
    }
}
