package com.lewis.limitservice.controller;

import com.lewis.limitservice.model.LimitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {
    @Autowired
    LimitProperties limitProperties;

    @GetMapping("/limits")
    public LimitProperties getLimitProps(){
        return limitProperties;
    }
}
