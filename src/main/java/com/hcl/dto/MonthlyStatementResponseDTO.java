package com.hcl.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyStatementResponseDTO {
	private long transactionId;

	private Date transactionDate;

	private long accountNo;

	private Double amount;

	private Double currentBal;

	private String credit_debit;

	private String message;
	
	

}
