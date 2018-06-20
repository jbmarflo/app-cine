package net.cine.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showMain(Model model) {
		List<String> movies = new LinkedList<>();
		movies.add("Rapidos y furiosos");
		movies.add("El aro 2");
		movies.add("Aliens");
		model.addAttribute("movies", movies);
		return "home";
	}
	
	@RequestMapping(value="detail")
	public String showDetail(Model model) {
		String movieTitle = "Rapidos y Furiosos";
		int duration = 136;
		double price = 50;
		model.addAttribute("title", movieTitle);
		model.addAttribute("duration", duration);
		model.addAttribute("price", price);
		
		return "detail";
	}
}
