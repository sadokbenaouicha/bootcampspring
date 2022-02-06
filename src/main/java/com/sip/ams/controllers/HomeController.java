package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/info")
	public String info()
	{
		System.out.println("sasaa");
		return "home/info";
	}
	
	@RequestMapping("/affichage")
	public String aff()
	{
		System.out.println("sashahaaa");
		return "home/affichage";
	}
	
}
