package com.example.demo;

import com.example.demo1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author THLiu
 */

@RestController
public class test {

    @Resource
    TestService testService;

    @GetMapping("get")
    public String get(){
        return testService.get();
    }

}
