package com.example.springboot_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {}
