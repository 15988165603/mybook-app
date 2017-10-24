package com.mybook.app.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 解决跨域问题
 * Created by ShanLin on 2017/4/11.
 */
@Configuration
public class WebProjectWebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
    	// http://spring.io/guides/gs/rest-service-cors/
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");// TODO
            }
        };
    }
}
