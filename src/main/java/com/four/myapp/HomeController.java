package com.four.myapp;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.four.myapp.service.MainService;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MainService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws SQLException {
		model.addAttribute("main",service.getMainList());
		model.addAttribute("recmd", service.getRecmdList());
		model.addAttribute("finish", service.getFinishedList());
		return "home";
	}
	
	@RequestMapping(value = "/about/about", method = RequestMethod.GET)
	public String about() throws SQLException {
		return "/about/about";
	}
}
