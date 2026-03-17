package com.easybytes.easyStore.controller;

import com.easybytes.easyStore.dto.UserDto;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/dummy")
@CrossOrigin(origins = "http://localhost:5173")
@Validated
public class DummyController {

    @PostMapping("/createUser")
    public String createUser(@RequestBody UserDto userDto){
        System.out.println(userDto);
        return "User created Successfuly";

    }


    @GetMapping("/search")
    public String searchUser(@Size(min = 5,max = 30) @RequestParam(required = false ,defaultValue = "default" ,name = "name") String Username){
        return "User found " + Username;

    }

    @GetMapping("/headers")
    public String readHeaders(@RequestHeader(name = "Location") String UserAgent){
        return " received headers  " + UserAgent;

    }


    @GetMapping("/multipleSearch")
    public String multipleSearch(@RequestParam Map<String,String> params){
        return "User found " + params.get("FirstName") +" " + params.get("LastName");

    }



}
