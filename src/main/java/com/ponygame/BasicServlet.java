package com.ponygame;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/ponygame")
public class BasicServlet extends HttpServlet {
    private static Logger LOGGER = Logger.getLogger(BasicServlet.class);
    private ApplicationContext applicationContext;

    @Override
    public void init() throws ServletException {
        applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello World" + applicationContext);
    }
}
