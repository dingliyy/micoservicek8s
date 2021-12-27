package com.dl.user.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class UserController {


    @GetMapping("/user/{userId}")
    public String get(@PathVariable(name = "userId") Integer userId ){
        Map<String, Object> data = new HashMap<>();
        data.put("id", userId);
        data.put("userName", "zhangsan");
        data.put("sex", "男");
        return JSON.toJSONString(data);
    }
}
