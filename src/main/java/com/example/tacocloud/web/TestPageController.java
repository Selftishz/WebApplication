package com.example.tacocloud.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Slf4j
@Controller
@RequestMapping("/testPage")
@SessionAttributes("tacoOrder")
public class TestPageController {
    @GetMapping
    public String showTestPage() {return "testPage";}
}
