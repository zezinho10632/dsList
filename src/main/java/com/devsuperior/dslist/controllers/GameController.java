package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.servicies.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
    @RequestMapping(value = "/game")
    public class GameController {
       @Autowired
        private GameService gameService;
        public List<Game> findAll; {

    }
}
