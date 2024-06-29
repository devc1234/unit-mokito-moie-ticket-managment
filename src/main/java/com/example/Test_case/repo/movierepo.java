package com.example.Test_case.repo;

import com.example.Test_case.entity.movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movierepo extends JpaRepository<movies ,Long> {
}
