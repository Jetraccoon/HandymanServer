package com.jetraccoon.handyman.server;

import com.jetraccoon.handyman.server.config.WebConfig;
import com.jetraccoon.handyman.server.repository.CunsomerRepository;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    private final static String DISPATCHER = "dispatcher";



    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(ctx));
        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER,new DispatcherServlet(ctx));
        servlet.addMapping("/");

    }


}
