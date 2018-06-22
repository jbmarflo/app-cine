package net.cine.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/news")
public class NewController {
	
	@GetMapping(value="/create")
	public String create() {
		
		return "new/formNew";
	}
	
	@PostMapping(value="create-new")
	public String save() {
		
		
		return "new/formNew";
	}
}
