package com.mcproblem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class Configuare {

	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder() {
		return new Jackson2ObjectMapperBuilder();
	}
}
