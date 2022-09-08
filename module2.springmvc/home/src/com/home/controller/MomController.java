package com.home.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mother")
public class MomController {
	
		@RequestMapping("/sugar")
		public String giveSugar() {
			return "sugar";
		}
		@RequestMapping("/processRequest")
		public String processRequest(HttpServletRequest request, Model model) {
			String str = request.getParameter("sq");
			model.addAttribute("amt", str);
			return "processrequest";
		}
		
}
