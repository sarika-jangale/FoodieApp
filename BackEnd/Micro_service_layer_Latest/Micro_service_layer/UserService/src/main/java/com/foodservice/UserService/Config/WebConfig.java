//package com.foodservice.UserService.Config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/users/**")
//                .allowedOrigins("http://localhost:3000")
//                .allowedMethods("POST","PUT","GET","DELETE","OPTIONS")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }
//}
