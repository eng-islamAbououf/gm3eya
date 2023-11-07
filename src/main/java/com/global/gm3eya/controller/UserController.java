package com.global.gm3eya.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/h")
    public ResponseEntity<?> getStart(){
        return ResponseEntity.ok("Hello");

    }
}
