package com.jetraccoon.handyman.server.controller;

import com.jetraccoon.handyman.server.entity.Cunsomer;
import com.jetraccoon.handyman.server.repository.CunsomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/handyman")
public class HandymanController {
    @Autowired
    private CunsomerRepository cunsomerRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getName(@RequestParam("name") String name,@RequestParam("title") String title){
        Cunsomer cunsomer = new Cunsomer();
        cunsomer.setName(name);
        cunsomer.setTitle(title);
        cunsomerRepository.saveAndFlush(cunsomer);
        return "success";
    }

}
