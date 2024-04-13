package com.example.ventaliz.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
	public static Logger log = LogManager.getLogger(InicioController.class);
	
	@GetMapping("")
	public String inicio(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
		Cookie mycookie = new Cookie("inicio", "123456789");
		response.addCookie(mycookie);
		return "/inicio";
	}
}
