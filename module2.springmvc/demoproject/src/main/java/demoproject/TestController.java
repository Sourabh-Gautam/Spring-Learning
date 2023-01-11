package demoproject;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/show")
	public String showView(Model model) {
		UserDto userDto = new UserDto();
		model.addAttribute("userDto", userDto);
		return "myview.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public String test(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult) {
		System.out.println(userDto.getName());
		System.out.println(bindingResult.hasErrors());
		return "myview";
	}
	
}
