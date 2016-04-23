package com.example;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Macro_Li on 2016/3/19.
 */
@Component
public class ErrorHandleController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/screen/error";
    }

    @RequestMapping
    public String errorHandle(){
        return getErrorPath();
    }
}
