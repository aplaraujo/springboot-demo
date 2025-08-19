package com.example.springboot_demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_demo.dto.GameMinDTO;
import com.example.springboot_demo.entities.Game;
import com.example.springboot_demo.repositories.GameRepository;

@Service // registrar a classe como um componente do sistema
public class GameService {

    @Autowired // injeção de uma instância em um serviço
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(game -> new GameMinDTO(game)).toList();
        return dto;
    }
}
