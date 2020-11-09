package com.blog.aw.admin.controller;

import com.blog.aw.admin.sevice.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/admin/login/")
public class AdminLoginController {

    @Autowired
    private AdminLoginService adminLoginService;

}
