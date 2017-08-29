package com.dzc.ci.web01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/29.
 */
@RestController
public class Controller {

    @GetMapping("/aa")
    public String aa() {
        return "hi,aa.";
    }
}
