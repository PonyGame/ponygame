package com.ponygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Nastya
 */

@Controller
public class GameboardController {
    
    @RequestMapping(value = "gameboard")
    public ModelAndView handleGameboardView() {
        return new ModelAndView("gameboard");
    }
}
