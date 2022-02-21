package com.example.demo;

import dao.SimpleDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private SimpleDao dao;

    public SimpleController(SimpleDao dao) {
        this.dao = dao;
    }

    @CrossOrigin
    @GetMapping("/")
    public String getShipments() {
        return dao.findAll();
    }
}
