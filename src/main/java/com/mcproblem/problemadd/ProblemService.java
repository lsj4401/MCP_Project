package com.mcproblem.problemadd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {

	@Autowired
	private ProblemRepository problemRepository;

	public Problem saveProblem(ProblemDto dto) {
		Problem problem = Problem.builder()
			.choice1(dto.getChoice1())
			.choice2(dto.getChoice2())
			.choice3(dto.getChoice3())
			.answer(dto.getAnswer())
			.build();

		return problemRepository.save(problem);
	}

	public List<Problem> listAllProblem() {
		return problemRepository.findAll();
	}
}
