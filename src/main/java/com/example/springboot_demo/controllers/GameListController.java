package com.example.springboot_demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_demo.dto.GameListDTO;
import com.example.springboot_demo.services.GameListService;

@RestController
@RequestMapping(value = "/lists") 
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
