package com.lc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.dto.UserDto;

@Controller
public class LoveController {

	@RequestMapping("/")
	public String homepage(@ModelAttribute("userDto") UserDto userDto) {
		return "homepage";
	}
	
//	@RequestMapping("/processhomepage")
//	public String processHomepage(
//			@RequestParam("yourname") String yourName, @RequestParam("crushname") String crushName, Model model) {
//		
//		model.addAttribute("yourname", yourName);
//		model.addAttribute("crushname", crushName);
//		
//		return "result";
//		
//	}
	
//	@RequestMapping("/processhomepage")
//	public String processHomepage(UserDto userDto, Model model) {
//		
//		model.addAttribute("yourname", userDto.getYourName());
//		model.addAttribute("crushname", userDto.getCrushName());
//		
//		return "result";
//		
//	}
//	
//	@RequestMapping("/processhomepage")
//	public String processHomepage(UserDto userDto, Model model) {
//		
//		model.addAttribute("userDto", userDto.getYourName());
//		
//		return "result";
//		
//	}
	
	@RequestMapping("/processhomepage")
	public String processHomepage(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult) {
		System.out.println(userDto);
		if(bindingResult.hasErrors()) {
			return "homepage";
		}
		return "result";
	}
	
}
