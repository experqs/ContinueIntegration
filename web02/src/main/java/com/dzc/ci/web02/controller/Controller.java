package com.dzc.ci.web02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/29.
 */
@RestController
public class Controller {

    @GetMapping("/bb")
    public String bb() {
        return "hi,bb.";
    }
}
