package com.github.gary.hook.core.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gaozhicheng on 2017/3/13.
 */
@Configuration
public class StarsFilterConfiguration {

    @Bean
    public FilterRegistrationBean secretFilterRegistration(@Value("${github.secret}")String sercet ) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SecurityFilter(sercet));
        registration.addUrlPatterns("/*");
        return registration;
    }
}
