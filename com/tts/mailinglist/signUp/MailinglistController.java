package com.tts.mailinglist.signUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



public class MailinglistController {
	
	
	@Autowired
	private MailingListRepository mailinglistRepository;
	
	@GetMapping(value= "/")
	public String index(SignUp user) {
		return "index" ;
		
	}
	
	private SignUp user;
	
	@PostMapping(value = "/")
	public String addNewSubscriber(SignUp user, Model model) {
		mailinglistRepository.save(new SignUp(user.getFirstName(), 
	        user.getLastName(), user.getFirstName(), user.getSignedUp()));
		model.addAttribute("firstName", user.getFirstName());
		model.addAttribute("lastName", user.getLastName());
		model.addAttribute("email", user.getEmail());
		return "signUp/results";
	}
}
