package com.movie.movie.service;

import com.movie.movie.dto.BranchDTO;

import java.util.List;

public interface BranchService {
    List<BranchDTO> getBranchesThatShowTheMovie(Integer movieId);
}
