package com.thepracticaldeveloper.jbosswildflydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JbossWildflyDemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JbossWildflyDemoApplication.class);
    }

    @Bean
    public HttpMessageConverters httpMessageConverters() {
        return new HttpMessageConverters();
    }

    public static void main(String[] args) {
        SpringApplication.run(JbossWildflyDemoApplication.class, args);
    }
}
