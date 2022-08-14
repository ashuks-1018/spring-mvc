package springggmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springggmvc.model.User;
import springggmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDatForModel(Model m) {
		
		m.addAttribute("Header", "LearnToCode");
		m.addAttribute("Desc", "Home for Programmers");
		System.out.println("Adding data to model");
		
	}

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Creating Form");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}
	
	/*
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail, @RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model) {

//		System.out.println("user email is : " + userEmail);
//		System.out.println("user name is :" + userName);
//		System.out.println("user password is :" + userPassword);

		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);

		System.out.println(user);

//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);

		model.addAttribute("user", user);

		return "success";
	}
	*/

}
