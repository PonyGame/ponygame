package com.ponygame.initializer;

import org.apache.log4j.Logger;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import javax.servlet.SessionTrackingMode;
import java.util.HashSet;

/**
 * To avoid using of web.xml at all and at the same time to be able to initialize Spring's ApplicationContext
 * we need this class which sets path to spring config xml and creates/adds Spring's DispatcherServlet
 */
public class WebAppInitializer implements WebApplicationInitializer {
    private static Logger LOGGER = Logger.getLogger(WebAppInitializer.class);

    @Override
    public void onStartup(ServletContext servletContext) {
        // Create Spring's WebApplicationContext and set config location
        XmlWebApplicationContext appContext = new XmlWebApplicationContext();
        appContext.setConfigLocation("/WEB-INF/classes/spring/all-beans.xml");

        // Goal of these listeners is to couple lifecycle of ServletContext with Spring's ApplicationContext.
        // ContextLoaderListener is called by ServletContext to do main work for initialization of Spring's ApplicationContext -
        // beans loading
        servletContext.addListener(new ContextLoaderListener(appContext));
        // Goal of RequestContextListener is to request-scope beans
        servletContext.addListener(new RequestContextListener());

        servletContext.setSessionTrackingModes(new HashSet<SessionTrackingMode>() {{
            add(SessionTrackingMode.COOKIE);
        }});
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        // We need separate context for Controllers mappings
        dispatcher.addMapping("/app/*");
        // We need separate context for WebSockets support
        dispatcher.addMapping("/websocket");

        LOGGER.debug("On startup by web app initializer");
    }
}