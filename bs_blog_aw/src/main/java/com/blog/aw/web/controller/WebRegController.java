package com.blog.aw.web.controller;

import com.blog.aw.web.service.WebRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/web/reg/")
public class WebRegController {

    @Autowired
    private WebRegService webRegService;
}
