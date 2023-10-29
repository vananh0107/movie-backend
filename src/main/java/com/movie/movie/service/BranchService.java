package com.movie.movie.service;

import com.movie.movie.dto.BranchDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BranchService {
    List<BranchDTO> getBranchesThatShowTheMovie(Integer movieId);
}
