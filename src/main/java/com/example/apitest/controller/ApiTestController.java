package com.example.apitest.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api3")
    @ApiOperation(value = "test api part 3", notes = "test api part 3")
    public String testApi3(@RequestParam(required = false) String testParam){
        return testParam;
    }

    @PostMapping("/api4")
    @ApiOperation(value = "test api part 4", notes = "test api part 4")
    public String testApi4(@RequestParam(required = false) String testParam){
        return testParam;
    }
}
