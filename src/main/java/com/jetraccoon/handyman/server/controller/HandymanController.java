package com.jetraccoon.handyman.server.controller;

import com.jetraccoon.handyman.server.entity.Cunsomer;
import com.jetraccoon.handyman.server.repository.CunsomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/handyman")
public class HandymanController {
    @Autowired
    private CunsomerRepository cunsomerRepository;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public Cunsomer getCunsomer(){
        return createCunsomer();
    }

    private Cunsomer createCunsomer() {
        Cunsomer cunsomer = new Cunsomer();
        cunsomer.setId(1);
        cunsomer.setName("kaka");
        cunsomer.setTitle("bulka");
        return cunsomer;
    }
}
