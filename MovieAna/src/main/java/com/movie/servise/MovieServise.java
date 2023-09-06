package com.movie.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dto.Movie;
import com.movie.repository.MovieRepo;

@Service
public class MovieServise {
	@Autowired
	MovieRepo repo;
	Movie movie;

	public String saveMovie(int id, String name, int cost) {
		repo.persit(id, name, cost);
		return repo.persit(id, name, cost);

	}

	public String changeIt(Movie movie) {
		return repo.update(movie);
	}

	public String deleted(int id) {
		return repo.delete(id);
	}

	public List<Movie> fetchdata() {
		return repo.getDetails();
	}
}
