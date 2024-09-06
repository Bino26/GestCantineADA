package com.gestcantine.GestCantineADA.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/addplat").setViewName("plats/forms");
//        registry.addViewController("/addmenu").setViewName("menu/forms");
    }
}
