package com.ssf.prototype.wwine.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("app")
public class HomeController{

    @GetMapping("**")
    public String index() {
        return "/index.html";
    }
    /*
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {

        String tmpURI = request.getRequestURI();
        return "test";
        //StringBuffer tmpURL = request.getRequestURL();
        //return new String(tmpURI + "," + tmpURL.toString());

        //return "index.html";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
    */
}
