package com.mcproblem.problemadd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Problem {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long problemId;

	@Column(name = "choice1")
	private String choice1;

	@Column(name = "choice2")
	private String choice2;

	@Column(name = "choice3")
	private String choice3;

	@Column(name = "answer")
	private Integer answer;

	@Column(name = "owner")
	private String owner;

	@Column(name = "category")
	private String category;
}
