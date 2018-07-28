package com.leong.masteringextjs.configuration.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 考试 api 文档.
 * 
 * @author mike.leong
 *
 */
@Configuration
@EnableSwagger2
public class ExamSwaggerConfiguration extends BaseSwaggerConfiguration {

	@Bean
	@Override
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo()).groupName("masteringextjs-api").select().paths(PathSelectors.regex("/.*")).build()
				.ignoredParameterTypes(ApiIgnore.class);
	}

	private ApiInfo apiInfo() {
		StringBuilder sb = new StringBuilder();
		return new ApiInfoBuilder().title("masteringextjs").description(sb.toString()).version("1.0").build();
	}
	

}
