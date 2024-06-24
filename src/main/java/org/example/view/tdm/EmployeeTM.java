package org.example.view.tdm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeTM implements Comparable<EmployeeTM> {
    private String EmployeID;
    private String EmployeName;
    private String contactNumber;
    private String address;
    private String NicNumber;

    @Override
    public int compareTo(EmployeeTM o) {
        return this.getEmployeName().compareTo(o.getEmployeName());
    }
}
