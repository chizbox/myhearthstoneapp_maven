package com.hearthstone.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hearthstone.service.MainListService;

@Controller
public class MainController {
	
	@Autowired
	MainListService mainListService;

	@RequestMapping("/main")
	public ModelAndView showCards(HttpServletRequest request) {
		String message = "displaying message from MainController";
		return new ModelAndView("main", "message", message);
	}
}
