package com.portifolio.portifoliopringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.portifoliopringboot.dto.GameListDTO;

import org.springframework.transaction.annotation.Transactional;

import com.portifolio.portifoliopringboot.Entities.GameList;
import com.portifolio.portifoliopringboot.Repository.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}