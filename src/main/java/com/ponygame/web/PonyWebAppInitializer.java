package com.ponygame.web;

import com.ponygame.BasicServlet;
import org.apache.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * To avoid using of web.xml at all and at the same time to be able to initialize Spring's ApplicationContext
 * we need this class which sets path to spring config xml and creates/adds Spring's DispatcherServlet
 */
public class PonyWebAppInitializer implements WebApplicationInitializer {
    private static Logger LOGGER = Logger.getLogger(BasicServlet.class);

    @Override
    public void onStartup(ServletContext container) {
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/classes/spring/all-beans.xml");
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        LOGGER.debug("On startup by web app initializer");
    }
}