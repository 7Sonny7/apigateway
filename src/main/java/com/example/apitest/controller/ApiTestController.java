package com.example.apitest.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RequiredArgsConstructor
@RestController
public class ApiTestController {

    @GetMapping("/api1")
    //@Tag(name = "test api part 1", description = "API Gateway Test API 입니다.")
    @ApiOperation(value = "test api part 1", notes = "test api part 1")
    public String testApi(){
        return "First Test API";
    }

    @PostMapping("/api2")
    @ApiOperation(value = "test api part 2", notes = "test api part 2")
    public String testApi2(){
        return "Second Test API";
    }
}
