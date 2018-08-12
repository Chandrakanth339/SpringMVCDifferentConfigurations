package com.chandrakanth.springmvcpurejava.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * This class is same as contextConfigLocation defined at init-param of
 * dispatcherservlet 
 * A Single Spring Application can have as many as
 * dispatcherservlets as required.
 * So, we can expect multiple class files
 * annotated with Configuration
 */

@Configuration
@EnableWebMvc  // same as <mvc: annotation-driven /> in bean-config file 
			   // (root or dispatcherservlet bean config)
@ComponentScan(basePackages = { "com.chandrakanth.springmvcpurejava.controller" })
public class SingleServletConfiguration extends WebMvcConfigurerAdapter {

	/*
	 * @Override public void configureViewResolvers(ViewResolverRegistry registry) {
	 * registry.jsp("/", ".jsp"); }
	 */
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry)
	 *
	 *	This method assembles the static resources like:
	 *												* CSS
	 *												* JS
	 *												* Images
	 *	<emp>stored directly under webapp</emp>
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");

	}
}
