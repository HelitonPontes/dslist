package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entidades.Game;

public class GameDTO {

  private long id;

  private String titulo;
  private int ano;
  private String genero;
  private String platafornma;
  private double pontuacao;
  private String imgUrl;
  private String descricaoCurta;
  private String descricaoLonga;

  // Construtores
  public GameDTO(){

  }

  public GameDTO(Game entidade) {

    BeanUtils.copyProperties(entidade, this);
    
    //id = entidade.getId();
    
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

  public String getPlatafornma() {
    return platafornma;
  }

  public void setPlatafornma(String platafornma) {
    this.platafornma = platafornma;
  }

  public double getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(double pontuacao) {
    this.pontuacao = pontuacao;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public String getDescricaoCurta() {
    return descricaoCurta;
  }

  public void setDescricaoCurta(String descricaoCurta) {
    this.descricaoCurta = descricaoCurta;
  }

  public String getDescricaoLonga() {
    return descricaoLonga;
  }

  public void setDescricaoLonga(String descricaoLonga) {
    this.descricaoLonga = descricaoLonga;
  }

}
