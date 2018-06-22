package net.cine.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.cine.app.model.Movie;
import net.cine.app.util.Util;

@Controller
public class HomeController {

	private SimpleDateFormat formatDate = new SimpleDateFormat("dd-MMM-yyyy");
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome(){
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showMain(Model model) {
		List<Movie> movies = getList();
		List<String> dateList = Util.getNextDays(4);
		model.addAttribute("dates", dateList);
		model.addAttribute("movies", movies);
		model.addAttribute("searchDate", formatDate.format(new Date()));
		return "home";
	}
	
	@RequestMapping(value="detail/{id}", method=RequestMethod.GET)
	public String showDetail(Model model, @PathVariable("id") int movieId) {
		// @RequestParam("id") is to get query param for url
		System.out.println(movieId);
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
			movie1.setImage("estreno1.png");
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
