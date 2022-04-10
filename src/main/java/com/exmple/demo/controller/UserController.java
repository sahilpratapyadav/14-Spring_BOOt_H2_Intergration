package com.exmple.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exmple.demo.service.UserService;
import com.exmple.demo.user.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ModelAndView loadForm() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("user", new User());
		mav.setViewName("userView");
		return mav;

	}

	@PostMapping("/user")
	public ModelAndView handlerSubmit(User user) {

		ModelAndView mav = new ModelAndView();
		String msgTxt = userService.saveUser(user);
		mav.addObject("msg", msgTxt);
		mav.setViewName("userView");

		return mav;
	}

}
