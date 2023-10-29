package com.movie.movie.service;

import com.movie.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    List<MovieDTO> findAllShowingMovies();
    MovieDTO getById(Integer movieId);
    List<MovieDTO> findAllShowingMoviesByName(String name);
}
