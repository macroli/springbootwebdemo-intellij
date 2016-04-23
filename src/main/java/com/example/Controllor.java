package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by Macro_Li on 2016/3/19.
 */@Controller
public class Controllor {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/index")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "index";
    }
}
