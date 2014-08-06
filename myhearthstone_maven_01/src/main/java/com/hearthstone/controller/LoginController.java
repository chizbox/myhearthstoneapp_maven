package com.hearthstone.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hearthstone.model.Card;
import com.hearthstone.model.LoginForm;
import com.hearthstone.model.User;
import com.hearthstone.service.MainListService;
import com.hearthstone.service.UserAccountService;

@Controller
public class LoginController {

	@Autowired
	UserAccountService userAccountService;
	
	// entrypoint for the application
	@RequestMapping("/loginForm")
	public String processForm(LoginForm loginForm, Map model,
			HttpServletRequest request) {

		boolean isFirstLoad = false;

		User user = userAccountService.getUser(loginForm.getUsername(),
				loginForm.getPassword());

		
		loginForm = (LoginForm) model.get("loginForm");

		String userName = user.getUsername();
		String password = user.getPassword();

		if (userName == null || password == null) {
			userName = "";
			password = "";
			loginForm.setUsername("");
			loginForm.setPassword("");
			isFirstLoad = true;
		}

		if (!loginForm.getUsername().equals(userName)
				|| !loginForm.getPassword().equals(password) || isFirstLoad) {
			System.out.println("there are no match found");
			request.getSession().setAttribute("user", null);
			return "main";
		}

		request.getSession().setAttribute("user", user);
		model.put("loginForm", loginForm);
		System.out.println("user found");

		return "main";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().setAttribute("user", null);
		return "main";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "user_registration";
	}
}
