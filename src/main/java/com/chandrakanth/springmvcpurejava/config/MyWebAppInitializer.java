package com.chandrakanth.springmvcpurejava.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/*
 * This class assembles 
 * 				* rootconfigclass(context-param value of contextConfigLocation)
 *  			* servletconfigclass(init-param value of contextConfigLocation defined inside <servlet> 
 *  			  tag of a single dispatcher servlet
 *  			* servletmappings (url-pattern of dispatcherservlet in web.xml) 
 * */

public class MyWebAppInitializer extends 
   AbstractAnnotationConfigDispatcherServletInitializer{

   @Override
   protected Class<?>[] getRootConfigClasses() {
	   
      return new Class[]{
    		  				MVCConfigClass.class, 
    		  				HibernateConfigClass.class
    		  			};
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      
	   return new Class[]{
			   				SingleServletConfiguration.class
			   			 };
   }

   @Override
   protected String[] getServletMappings() {
      
	   return new String[]{
			   				"/"
			   			  };
   }
}
