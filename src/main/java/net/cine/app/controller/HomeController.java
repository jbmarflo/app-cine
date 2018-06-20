package net.cine.app.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.cine.app.model.Movie;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showMain(Model model) {
		List<Movie> movies = getList();
		//movies.add("Rapidos y furiosos");
		//movies.add("El aro 2");
		//movies.add("Aliens");
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
	
	private List<Movie> getList() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Movie> list = null;
		
		try {
			list = new LinkedList<>();
			
			Movie movie1 = new Movie();
			movie1.setId(1);
			movie1.setTitle("Power Ranger");
			movie1.setDuration(120);
			movie1.setClassification("B");
			movie1.setType("Aventura");
			movie1.setReleaseDate(formatter.parse("02-05-2018"));
			
			Movie movie2 = new Movie();
			movie2.setId(1);
			movie2.setTitle("Dragon Ball");
			movie2.setDuration(34);
			movie2.setClassification("C");
			movie2.setType("Anime");
			movie2.setReleaseDate(formatter.parse("02-12-2018"));
			movie2.setState("0");
			
			list.add(movie1);
			list.add(movie2);
			
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
}
