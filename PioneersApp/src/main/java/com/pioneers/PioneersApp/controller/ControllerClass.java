package com.pioneers.PioneersApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
	
	@RequestMapping("/a")
	public String resolve() {
		return "page1";
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String resolvee() {
		return "This is the reponse from landing page";
	}
}
