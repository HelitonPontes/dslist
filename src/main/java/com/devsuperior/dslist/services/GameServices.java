package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
//import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entidades.Game;
import com.devsuperior.dslist.repository.GameRepository;


@Service
public class GameServices {

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO finById(Long id){
    Game buscarIdGame = gameRepository.findById(id).get();
    GameDTO gameDTO = new GameDTO(buscarIdGame);
    return gameDTO;

  }

  @Transactional(readOnly = true)
  public List<Game> findAll(){
    List<Game> buscarGame = gameRepository.findAll();
    return buscarGame;

  }
  
}
