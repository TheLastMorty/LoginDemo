package com.han.LoginDemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    /**
     * 页面跨域访问Controller过滤
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")  //路径全匹配
                .allowedOriginPatterns("*") //支持跨域访问
                .allowCredentials(true) //支持request对象传送cookie之类的参数
                .allowedHeaders("*") //设置支持header匹配
                .allowedMethods("POST","GET"); //设置支持的跨域请求方法类型
    }

}