package com.example.springboot_demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_demo.dto.GameDTO;
import com.example.springboot_demo.dto.GameMinDTO;
import com.example.springboot_demo.services.GameService;

@RestController // configurar o controlador
@RequestMapping(value = "/games") // configurar o caminho que vai ser respondido na API
public class GameController {
    @Autowired // injeção de serviço no controlador
    private GameService gameService;

    @GetMapping(value="/{id}") // obter os dados da API
    public GameDTO findById(@PathVariable Long id) { // certificar-se de que vai retornar o id correto
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping // obter os dados da API
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
