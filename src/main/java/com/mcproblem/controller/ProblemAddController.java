package com.mcproblem.controller;

import com.mcproblem.problemadd.ProblemDto;
import com.mcproblem.problemadd.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/add")
public class ProblemAddController {

	@Autowired
	private ProblemService problemService;

	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view() {
		return "/add/problemAdd";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public HttpStatus addProblem(@RequestBody ProblemDto problemDto) {
		problemService.saveProblem(problemDto);
		return HttpStatus.OK;
	}
}
