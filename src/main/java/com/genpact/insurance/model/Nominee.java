package com.genpact.insurance.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("nominee")
public class Nominee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int serialNo;
    public String userId;
    public String firstName;
    public String middleName;
    public String lastName;
    public String bloodGroup;
    public String currentAddress;
    public String permanentAddress;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    public Date dob;
    public String phoneNumber;
    public boolean guardian;
    public String guardianName;
    public int guardianAge;
    public String guardianPhone;
    public String guardianAddress;



    public Nominee(String firstName, String middleName, String lastName, String userId, String guardianName, String currentAddress, String permanentAddress, Date dob, String guardianPhone, String guardianAddress, int guardianAge) {

    }
}

