package com.hcl.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundTransferRequestDTO {

	@NotNull(message="please enter fromaccount")
	@Positive(message="please enter postive value")
	private long fromAccount;
	
	@NotNull(message="please enter toaccount")
	@Positive(message="please enter postive value")
	private long toAccount;
	
	@NotNull(message="please enter amount")
	@Positive(message="please enter postive value")
	@Min(100)
	@Max(9000)
	private Double amount;
	
	private String remarks;

	
}
