package com.ireland.travel.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ireland.travel.model.Customer;
import com.ireland.travel.service.CustomerService;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	CustomerService customerService;
	
	
	@RequestMapping("register")
	public String createForm(Model model) {
		model.addAttribute("user", new Customer());
		return "user/register";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") @Valid Customer customer, BindingResult result) {
		
		if (result.hasErrors()) {
			return "user/register";
		}
		customerService.saveCustomer(customer);
		
		return "user/saveSuccess";	
		
//		return "redirect:/users/" + customer.getName();
	}
	
	@RequestMapping (value="/users/{userId}")
	public String getUserProfile (@PathVariable String userId, Model model){
		Customer customer = customerService.findCustomer(userId);
		model.addAttribute("user", customer);
		return"user/view";
	}
	
	
}
