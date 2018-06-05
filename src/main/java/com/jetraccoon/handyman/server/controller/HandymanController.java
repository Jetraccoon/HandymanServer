package com.jetraccoon.handyman.server.controller;

import com.jetraccoon.handyman.server.entity.Cunsomer;
import com.jetraccoon.handyman.server.repository.CunsomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class HandymanController {
    @Autowired
    private CunsomerRepository cunsomerRepository;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Cunsomer> getAllCunsomer() {
        return cunsomerRepository.findAll();
    }
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Cunsomer getCunsomer(@PathVariable long id) {
        return cunsomerRepository.findById(id).get();
    }

    @RequestMapping(value = {"/create"},method = {RequestMethod.GET}
    )
    public String createCunsomer(@RequestParam("name") String name, @RequestParam("title") String title) {
        Cunsomer cunsomer = new Cunsomer();
        cunsomer.setName(name);
        cunsomer.setTitle(title);
        cunsomerRepository.saveAndFlush(cunsomer);
        return "Success";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCunsomer(@PathVariable long id) {
        cunsomerRepository.deleteById(id);
        return "Success deleted cunsomer id="+ id;
    }
}
