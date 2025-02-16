package com.ems.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {

//		Authentication authentication = SecurityContextHolder.getContext()
//				.getAuthentication();
//		
//		if (authentication != null) {
//			new SecurityContextLogoutHandler().logout(request, response,
//					authentication);
//		}
		request.getSession().invalidate();

		return "redirect:/";
	}
}
