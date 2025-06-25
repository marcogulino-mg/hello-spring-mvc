package org.lesson.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/greetings")
    public String greetUser(@RequestParam String name,
            @RequestParam String lastname, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("lastname", lastname);
        return "userGreetings";
    }

}
