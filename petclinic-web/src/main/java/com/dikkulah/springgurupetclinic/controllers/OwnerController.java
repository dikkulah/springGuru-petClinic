package com.dikkulah.springgurupetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners","/owners/"})
    public String listOwners(){

        return "owners/index";
    }
}
