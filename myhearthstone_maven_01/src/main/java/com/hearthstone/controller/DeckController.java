package com.hearthstone.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeckController {

	@RequestMapping("/decks")
	public String createDeck(HttpServletRequest request){
		
		return "createdeck";
	}
}
