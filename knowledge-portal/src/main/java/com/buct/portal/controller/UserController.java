package com.buct.portal.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author dysprosium
 * @since 2023-04-05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

