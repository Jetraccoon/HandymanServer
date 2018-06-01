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
    public String getName(@RequestParam("name") String name,@RequestParam("title") String title){
        Cunsomer cunsomer = new Cunsomer();
        cunsomer.setName(name);
        cunsomer.setTitle(title);
        cunsomerRepository.saveAndFlush(cunsomer);
        return "success";
    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id){
        List<Cunsomer> list = cunsomerRepository.findAll();
        if(id<=list.size()-1){
            long ID=list.get(id).getId();

            String Name=list.get(id).getName();

            String Text=list.get(id).getTitle();
            return "ID:"+id+" Name:"+Name+" Text:"+Text;
        }
        return "Ошибка";
    }

}
