package com.ponygame;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

/**
 * Class for handling start/stop of the whole web application
 */
@WebListener
public class PonyWebAppServletContextListener implements ServletContextListener {
    private static Logger LOGGER = Logger.getLogger(PonyWebAppServletContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.debug("Application was deployed and started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
