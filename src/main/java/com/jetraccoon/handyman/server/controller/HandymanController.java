package com.jetraccoon.handyman.server.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handyman")
public class HandymanController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getName(){
        return "RUFET";
    }

}
