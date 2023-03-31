/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.dailycodebuffer.Spring.boot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Deep Banerji
 */
@RestController
//@RequestMapping(value = "/url",method=RequestMethod.GET)
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "CRIS Kolkata";
    }

}
