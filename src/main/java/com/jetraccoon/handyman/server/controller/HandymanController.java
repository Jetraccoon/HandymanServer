package com.jetraccoon.handyman.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/handyman")
public class HandymanController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getName(ModelMap model){
        return "RUFET";
    }


}
