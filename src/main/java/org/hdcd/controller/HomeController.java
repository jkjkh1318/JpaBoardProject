package org.hdcd.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Locale locale){
        //info 레벨 로그를 출력한다.
        //TODO info 레벨이 어딘지 모르겠음!
        log.info("Welcome home! The client locale is " + locale);

        return "home";
    }



}


