package com.kuber.cabapp.loginsignup.controller;

import com.kuber.cabapp.loginsignup.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @PostMapping("/signup")
    public void sign_Up(@RequestBody User user)
    {
       
    }
}
