package com.genpact.insurance.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NomineeDto {


    public String firstName;
    public String middleName;
    public String lastName;
    public String userId;   //
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



    public NomineeDto(String firstName, String middleName, String lastName, String userId, String guardianName, String currentAddress, String permanentAddress, Date dob, String guardianPhone, String guardianAddress, int guardianAge) {

    }
}

