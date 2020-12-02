package com.digitalacademy.loan.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LoanInfoModel {
    private Long id;
    private String status;
    private String accountPayable;
    private String accountReceivable;
    private double principalAmount;
}
