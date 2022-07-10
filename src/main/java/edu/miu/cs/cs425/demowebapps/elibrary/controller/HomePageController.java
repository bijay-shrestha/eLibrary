package edu.miu.cs.cs425.demowebapps.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bijayshrestha on 7/10/22
 * @project eLibrary
 */
@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/elibrary", "/elibrary/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
