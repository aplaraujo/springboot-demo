package com.example.springboot_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_demo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {}
