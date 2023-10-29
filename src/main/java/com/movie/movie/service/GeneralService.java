package com.movie.movie.service;

import java.util.List;
import java.util.Optional;

public interface GeneralService<T> {
    List<T> findAll();

    Optional<T> findById(Integer id);

    T save(T t);

    void remove(Integer id);
}
