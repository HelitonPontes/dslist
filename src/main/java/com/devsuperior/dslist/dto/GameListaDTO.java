package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entidades.GameLista;

public class GameListaDTO {
  private Long id;
  private String nome;


  //contrustores
  public GameListaDTO(){

  }

  public GameListaDTO(GameLista lista) {
    id = lista.getId();
    nome = lista.getNome();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  
}
