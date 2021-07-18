package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags ="测试金肯四" )
public class TestController {

    @GetMapping(value = "/test")
    @ApiOperation("cesui")
    public String test(){
        return "测试 Jenkis";
    }


    @GetMapping(value = "/test1")
    @ApiOperation("cesui22222")
    public String test1(){
        return "测试 Jenkis";
    }
}
