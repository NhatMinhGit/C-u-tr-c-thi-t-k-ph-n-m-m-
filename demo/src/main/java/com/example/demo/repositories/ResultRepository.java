package com.example.demo.repositories;

import com.example.demo.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, String> {
}