package com.example.demo.controller;

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Service service = new Service();

    @GetMapping("/clima")
    public String preverTempo() {
        return service.preverTempo();
    }

}
