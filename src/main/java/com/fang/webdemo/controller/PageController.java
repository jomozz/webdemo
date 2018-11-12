package com.fang.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* author fangzhongming
* createDate 18/10/29
*/

@Controller("pageController")
public class PageController {


    @RequestMapping("/index")
    public String index(){

        return "web3_demo";

    }
}
