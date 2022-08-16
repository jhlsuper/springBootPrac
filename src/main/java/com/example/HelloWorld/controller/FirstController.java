package com.example.HelloWorld.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FirstController {

    public String niceToMeetYou() {
        return "greetings"; //template/greetings.mustache 를 브라우저로 전송

    }
}
