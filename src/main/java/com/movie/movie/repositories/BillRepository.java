package com.movie.movie.repositories;

import com.movie.movie.pojo.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
