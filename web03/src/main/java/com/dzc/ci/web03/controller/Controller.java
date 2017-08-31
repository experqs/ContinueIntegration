package com.dzc.ci.web03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/30.
 */
@RestController
public class Controller {

    @GetMapping("/cc")
    public String cc() {
        return "hi,cc. Add by CI!";
    }
}
