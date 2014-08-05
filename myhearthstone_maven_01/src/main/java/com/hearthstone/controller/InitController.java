package com.hearthstone.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hearthstone.model.Card;
import com.hearthstone.model.HSClass;
import com.hearthstone.service.MainListService;

@Controller
public class InitController {

	@Autowired
	MainListService mainListService;

	@RequestMapping("/init")
	public ModelAndView loadApplication(HttpServletRequest request) {
		// load up cards to list
		List<Card> cards = mainListService.getCards();
		request.getSession().setAttribute("cards", cards);

		// load up class cards to session
		List<HSClass> hSClass = mainListService.getHSClass();
		request.getSession().setAttribute("hsclass", hSClass);

		return new ModelAndView("main");
	}

}
