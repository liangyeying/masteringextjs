package com.leong.masteringextjs.configuration.swagger;

import org.springframework.context.annotation.Bean;

import springfox.documentation.spring.web.plugins.Docket;
/**
 * Swagger-ui 配置抽象类，配置完成后可以访问: host:port/swagger-ui.html 查看.
 * @author mike.leong
 *
 */
public abstract class BaseSwaggerConfiguration {
	/**
	 * 创建 Swagger 的 Docket，实现此方法时需要加注解 {@linkplain Bean}.
	 * @return {@linkplain Docket}
	 */
	public abstract Docket api();
	
}
