package com.ONeutral.springbootemail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    /**
     * 首页
     */
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
}
