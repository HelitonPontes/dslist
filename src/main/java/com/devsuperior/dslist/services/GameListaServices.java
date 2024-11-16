package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListaDTO;
import com.devsuperior.dslist.entidades.GameLista;
import com.devsuperior.dslist.repository.GameListaRepository;


@Service
public class GameListaServices {

  @Autowired
  private GameListaRepository gameListaRepository;

  @Transactional(readOnly = true)
  public List<GameListaDTO> findAll(){
    List<GameLista> buscarGame = gameListaRepository.findAll();
    return buscarGame.stream().map(x -> new  GameListaDTO()).toList();

  }
  
}
