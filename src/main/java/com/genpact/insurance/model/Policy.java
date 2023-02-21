package com.genpact.insurance.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "policies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Policy {

    @Id
    private String policyId;
    private String policyNumber;
    private String insuranceProvider;
    private String policyName;
    private String policyStartDate;
    private String policyEndDate;
    private Double policySumAssured;
    private Double premiumAmount;
    private String nominee1;
    private String nominee2;
    private String nominee3;
    private String nominee4;
    private String nominee5;
    private Double nomineePercentage;
    private String typeOfPolicy;
    private String productId;

}
