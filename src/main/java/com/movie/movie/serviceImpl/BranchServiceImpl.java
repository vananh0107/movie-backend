package com.movie.movie.serviceImpl;

import com.movie.movie.dto.BranchDTO;
import com.movie.movie.repository.BranchRepository;
import com.movie.movie.service.BranchService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<BranchDTO> getBranchesThatShowTheMovie(Integer movieId) {
        return branchRepository.getBranchThatShowTheMovie(movieId)
                .stream().map(branch -> modelMapper.map(branch,BranchDTO.class))
                .toList();
    }
}
