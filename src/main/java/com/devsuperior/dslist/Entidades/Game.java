package com.devsuperior.dslist.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb-game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String titulo;
  private int ano;
  private String genero;
  private String platafornma;
  private String imgUrl;
  private String descricaoCurta;
  private String descricaoLonga;

  //Contrutores
  public Game (){

  }

  public Game(long id, String titulo, int ano, String genero, String platafornma, String imgUrl, String descricaoCurta,
  String descricaoLonga) {
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
    this.genero = genero;
    this.platafornma = platafornma;
    this.imgUrl = imgUrl;
    this.descricaoCurta = descricaoCurta;
    this.descricaoLonga = descricaoLonga;
  }

  //metodos get e set
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

// Metdo de comparar ID (hash)
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Game other = (Game) obj;
    if (id != other.id)
      return false;
    return true;
  }

  
}
