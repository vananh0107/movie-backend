package com.movie.movie.api;

import com.movie.movie.dto.BranchDTO;
import com.movie.movie.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/api/branches")
public class BranchApi {
    @Autowired
    private BranchService branchService;

    @GetMapping
    private ResponseEntity<List<BranchDTO>> getBranchesThatShowTheMovie(@RequestParam Integer movieId){
        return new ResponseEntity<>(branchService.getBranchesThatShowTheMovie(movieId), HttpStatus.OK);
    }
}
