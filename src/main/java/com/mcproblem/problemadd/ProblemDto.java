package com.mcproblem.problemadd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDto {
	private String choice1;
	private String choice2;
	private String choice3;
	private Integer answer;
}
