package com.randomgreetingsgenerator.randomgreetingsgenerator.controllers;

import com.randomgreetingsgenerator.randomgreetingsgenerator.greetings.Greetings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class RandomGreetingController {
    Greetings greetings = new Greetings();
    Random r = new Random();

    @RequestMapping({"", "/"})
    public String randomGreeting(Model model) {
        int i = r.nextInt(greetings.getGreetings().length);
        model.addAttribute("greeting", greetings.getRandomGreeting(i));

        return "randomgreeting";
    }


}
