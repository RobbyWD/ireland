package com.ireland.travel.web.web;



import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ireland.travel.entity.domain.Authority;
import com.ireland.travel.entity.domain.Customer;
import com.ireland.travel.entity.domain.Role;
import com.ireland.travel.entity.domain.User;
import com.ireland.travel.web.service.AuthService;
import com.ireland.travel.web.service.CustomerService;
import com.ireland.travel.web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	AuthService authService;
	
	
	
	@RequestMapping(params="register")
	public String createForm(Model model) {
		model.addAttribute("user", new Customer());
		return "user/register";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") @Valid Customer customer, BindingResult result) {
		
		if (result.hasErrors()) {
			return "user/register";
		}
		else{
			customer.setEnabled(true);
			customer.setRole(Role.ROLE_USER);
			customerService.saveCustomer(customer);
			return "redirect:/users/" + customer.getUsername();
		}
				
	}
		
	@RequestMapping (value="/{userId}")
	public String getUserProfile (@PathVariable String userId, Model model){
		User user = userService.findUser(userId);
		model.addAttribute("user", user);
		return"user/view";
	}
	
	@RequestMapping (value="/{userId}/view")
	public String getDetailedUserProfile (@PathVariable String userId, Model model){
		User user = userService.findUser(userId);
		model.addAttribute("user", user);
		return"user/detailedview";
	}
	
	
	@RequestMapping(value = "/{userId}/edit", method = RequestMethod.GET)
	public String editUserProfile(@PathVariable("userId") String userId,
			Map<String, Object> model) {
		Customer user = customerService.findCustomer(userId);
		model.put("user", user);
		return "user/edit";
	}
	
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute("user") @Valid Customer user,
			BindingResult result) {
		if (result.hasErrors()) {
			return "user/register";
		}
		customerService.updateCustomer(user);
//		authService.updateUser(new Authority(user));
		return "redirect:/users/" + user.getUsername();
	}
	
}
