package com.psa.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flightapp.entities.User;
import com.psa.flightapp.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping(path = "/showReg")
	public String showRegistrationPage() {
		return "login/newRegistration";
	}
	
	@RequestMapping(path = "/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
	@PostMapping(path = "/saveReg")
	public String saveNewRegistration(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping(path= "/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap) {
		User user = userRepo.findByEmail(email);
		if(user!=null) {
		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
			return "searchFlights";
		}else {
			modelMap.addAttribute("errors", "Invalid username/password");
			return "login/login";
		}
		
	}else {
		modelMap.addAttribute("error", "Invalid username/password");
		return "login/login";
	}
}
}