package com.example.springboot_demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot_demo.dto.GameListDTO;
import com.example.springboot_demo.entities.GameList;
import com.example.springboot_demo.repositories.GameListRepository;


@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(game -> new GameListDTO(game)).toList();
    }

}
