package com.example.jike.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * ProjectName: jike
 * User: quent
 * Date: 2018/5/27
 * Time: 14:23
 */
@RestController
public class LoginController {
    @GetMapping(value = "/login")
    public boolean login(String username,String password){
        return true;
    }
}
