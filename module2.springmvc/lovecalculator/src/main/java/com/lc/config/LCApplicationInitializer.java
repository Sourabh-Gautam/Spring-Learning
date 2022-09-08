package com.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LCApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//create DispatcherServlet object
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalAppConfig.class);
		DispatcherServlet ds = new DispatcherServlet(webApplicationContext);
		
		//Register DispatcherServlet object with ServletContext
		ServletRegistration.Dynamic sc  = servletContext.addServlet("frontcontroller", ds);
		sc.setLoadOnStartup(1);
		sc.addMapping("/myhome/*");
	}

}
