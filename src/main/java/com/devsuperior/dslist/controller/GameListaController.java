package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.dto.GameListaDTO;
import com.devsuperior.dslist.services.GameListaServices;

@RestController
@RequestMapping (value = "/lista")
public class GameListaController {

  @Autowired 
  private GameListaServices gameListaServices;

 
  @GetMapping
  public List<GameListaDTO>findAll(){
    List<GameListaDTO> gamelista = gameListaServices.findAll();
    return gamelista;
  
  }

  //@GetMapping
  //public List<Game>findAlllList(){
   // List<Game> lista = gameServices.findAll();
   // return lista;
  
  //}
  
}
