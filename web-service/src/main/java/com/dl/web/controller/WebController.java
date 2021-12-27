package com.dl.web.controller;

import com.dl.web.feign.UserFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class WebController {
    @Autowired
    private UserFeign userFeign;

    @GetMapping("/user/{userId}")
    public String getUserInfo(@PathVariable(name = "userId") Integer userId){
        return userFeign.getUser(userId);
    }
}
