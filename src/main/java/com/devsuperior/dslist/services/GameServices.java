package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entidades.Game;
import com.devsuperior.dslist.repository.GameRepository;


@Service
public class GameServices {

  @Autowired
  private GameRepository gameRepository;

  public List<Game> findAll(){
    List<Game> listagemGame = gameRepository.findAll();
    return listagemGame;

  }
  
}
