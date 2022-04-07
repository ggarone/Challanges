package com.garone.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/gestione/login").setViewName("static/login.html");
//		registry.addViewController("/gestione/list").setViewName("viaggi");
//		registry.addViewController("/gestione/add").setViewName("acquista");
//		registry.addViewController("/gestione/prenotazioni").setViewName("prenotazioni");
//		
//		
//		registry.addViewController("/admin").setViewName("admin");
//		
//	}

//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/templates/**").addResourceLocations("/templates/");
//	}

	
	
}