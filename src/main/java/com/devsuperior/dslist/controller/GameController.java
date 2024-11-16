package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entidades.Game;
import com.devsuperior.dslist.services.GameServices;

@RestController
@RequestMapping (value = "/games")
public class GameController {

  @Autowired 
  private GameServices gameServices;

  @GetMapping
  public List<GameMinDTO>findAll(){
    List<Game> listagemgaame = gameServices.findAll();
    List<GameMinDTO> minDTO = listagemgaame.stream().map(x ->new GameMinDTO(x)).toList();
    return minDTO;
  
  }

  @GetMapping
  public List<Game>findAlllList(){
    List<Game> lista = gameServices.findAll();
    return lista;
  
  }
  
}
