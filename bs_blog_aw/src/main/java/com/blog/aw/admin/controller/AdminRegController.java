package com.blog.aw.admin.controller;

import com.blog.aw.admin.sevice.AdminRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/admin/reg/")
public class AdminRegController {

    @Autowired
    private AdminRegService adminRegService;
}
