package com.suhrid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suhrid on 10/27/16.
 */

@Controller
public class Home {
    @RequestMapping(value = "/")
    @ResponseBody
    public String homePage() {
        return "hello";
    }
}
