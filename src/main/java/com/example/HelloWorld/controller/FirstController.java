package com.example.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "Jeff Lee");
        return "greetings"; //template/greetings.mustache 를 브라우저로 전송

    }
}
