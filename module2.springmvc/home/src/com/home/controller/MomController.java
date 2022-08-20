package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
		public MomController() {
			System.out.println("Contstructor called");
		}
	
		@ResponseBody
		@RequestMapping("/sugar")
		public String giveSugar() {
			return "Here is your sugar";
		}
		
}
