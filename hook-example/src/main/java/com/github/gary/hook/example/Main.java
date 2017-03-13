package com.github.gary.hook.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by gaozhicheng on 2017/3/9.
 */

@SpringBootApplication
@ComponentScan("com.github.gary.hook.core,com.github.gary.hook.example")
public class Main extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {


    public static void main(String[] args) {
        try {
            SpringApplication app = new SpringApplication(Main.class);
            ConfigurableEnvironment environment = app.run(args).getEnvironment();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(7004);
    }
}
