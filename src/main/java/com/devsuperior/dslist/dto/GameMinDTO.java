package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entidades.Game;

public class GameMinDTO {
  
  private long id;
  private String titulo;
  private int ano;
  private String genero;
  private String imgUrl;

  public GameMinDTO(){

  }

  public GameMinDTO(long id, String titulo, int ano, String genero, String imgUrl) {
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
    this.genero = genero;
    this.imgUrl = imgUrl;
  }

  public GameMinDTO(Game entidadeGame) {
    id = entidadeGame.getId();
    titulo = entidadeGame.getTitulo();
    this.ano = entidadeGame.getAno();
    this.genero = entidadeGame.getGenero();
    this.imgUrl = entidadeGame.getImgUrl();
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

}
