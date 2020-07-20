package com.wjs.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientController {
    @RequestMapping("/test")
    public String testController() {
      return "transactions";
    }
}