package com.example.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class CommonEntitesConfig {

	@Bean
	public Docket postsApi() {

		return new Docket(DocumentationType.SWAGGER_2).groupName("CommonEntites Assignment").apiInfo(apiInfo()).select()
				.paths(regex("/common.*")).build();

	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder().title("Common Entites")
				.description("Sample Documentation Generateed Using SWAGGER2 for our CommonEntites Rest API").build();

	}
}
