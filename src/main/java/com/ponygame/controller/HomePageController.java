package com.ponygame.controller;

import com.ponygame.model.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
@Component
public class HomePageController {

    @Autowired
    TestBean testBean;

    @RequestMapping(value = "/homepage")
    @ResponseBody
    public ModelAndView handleHomePage(HttpServletRequest req, HttpServletResponse resp) {

        return new ModelAndView("homePageTemplate").
                addAllObjects(new HashMap<String, Object>() {{
                            put("testVariable", testBean);
                        }});
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }
}
