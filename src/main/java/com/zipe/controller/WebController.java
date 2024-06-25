package com.zipe.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping({"/thymeleaf"})
    public String thymeleaf() {
        return "html/hello";
    }

    @GetMapping({"/demo"})
    public String demo() {
        log.info("webjars");
        return "html/demo";
    }

    @GetMapping({"/table"})
    public String table() {
        return "html/table";
    }

    @GetMapping({"/bulletinBoard"})
    public String broadcast() {
        return "html/bulletin_board";
    }

}
