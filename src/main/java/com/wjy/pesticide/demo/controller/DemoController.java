package com.wjy.pesticide.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jerrywang
 * @create 2018/7/29.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    String home(){
//        demoDao.getUsers();
        return "index";
    }
}
