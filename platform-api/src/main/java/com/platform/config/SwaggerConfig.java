package com.platform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;

/**
 * @author pengjun
 * @gitee https://gitee.com/fuyang_hukai/platform
 */
@Configuration
@EnableWebMvc
@EnableSwagger2WebMvc
@ComponentScan(basePackages = "com.platform.api")
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .groupName("移动端商城接口")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.platform.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        @SuppressWarnings("deprecation")
        ApiInfo info = new ApiInfo(
                "蓝鲸商城",
                description(),
                "1.0"
                new Contact("hukai", "https://gitee.com/fuyang_hukai", "365157138@qq.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
        return info;
    }

    private String description() {
        return "OUC蓝鲸商城";
    }
}
