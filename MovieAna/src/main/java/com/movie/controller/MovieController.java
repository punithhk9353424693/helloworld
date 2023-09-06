package com.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.movie.dto.Movie;
import com.movie.servise.MovieServise;

@Controller
public class MovieController {
	@Autowired
	MovieServise servise;
	Movie m;

	@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mav = new ModelAndView();
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int cost = Integer.parseInt(req.getParameter("cost"));
		String s = servise.saveMovie(id, name, cost);
		mav.setViewName("store.jsp");
		mav.addObject("output", s);
		return mav;

	}
    @RequestMapping("/update")
    public ModelAndView modify1(Movie movie) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("update.jsp");
		return mav;
    }
	
	@RequestMapping("/change")
	public ModelAndView modify(@ModelAttribute Movie movie) {
		ModelAndView mav = new ModelAndView();
		movie.getId();
		movie.getName();
		movie.getCost();
		String sup=servise.changeIt(movie);
		mav.setViewName("UpdatedData.jsp");
		mav.addObject("run", sup);
		return mav;
	}
	@RequestMapping("/vanish")
	 public ModelAndView clear() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("delete.jsp");
		return mav;
    }
	@RequestMapping("/delete1")
	public ModelAndView  remove(int id) {
		ModelAndView mav = new ModelAndView();
		String sup=servise.deleted(id);
		mav.setViewName("deleted.jsp");
		mav.addObject("del", sup);
		return mav;
	}
	@RequestMapping("/getdetails")
	public ModelAndView moviedetails() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Alldetails.jsp");
		mav.addObject("movies",servise.fetchdata());
		return mav;
	}
}
