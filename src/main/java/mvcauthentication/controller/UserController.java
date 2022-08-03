package mvcauthentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvcauthentication.dto.User;

@Controller
public class UserController {

	@RequestMapping("/login")
	public void login(Model data)
	{
		data.addAttribute("loginDetails", new User());
		
	}
	
	@RequestMapping("/authenticate")
	public ModelAndView authenticate(@ModelAttribute("loginDetails")User objUser)
	{
		if(objUser.getUserName().equals("abc") && objUser.getPassword().equals("abc"))
		return new ModelAndView("welcome","message","you have been authenticated");
		else 
			return new ModelAndView("failure","msg","Authentication failure..");
	}
	
}
