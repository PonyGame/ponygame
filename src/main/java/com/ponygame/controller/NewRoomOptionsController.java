package com.ponygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewRoomOptionsController {

    @RequestMapping(value = "${url.new.room.options}")
    public ModelAndView handleNewRoomOptions() {
        return new ModelAndView("dialogs/new-room-options");
    }

}
