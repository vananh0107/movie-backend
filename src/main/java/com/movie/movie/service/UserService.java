package com.movie.movie.service;

import com.movie.movie.pojo.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;
public interface UserService extends GeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
