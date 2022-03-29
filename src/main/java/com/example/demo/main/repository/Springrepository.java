package com.example.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.main.model.Home;

@Repository
public interface Springrepository extends JpaRepository<Home,Long> {

}
