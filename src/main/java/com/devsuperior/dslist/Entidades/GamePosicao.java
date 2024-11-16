package com.devsuperior.dslist.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb-gameposicao")
public class GamePosicao {

  @EmbeddedId
  private GameposicaoPK id= new GameposicaoPK();


  private int posicao;

  //construyores
  public GamePosicao(){

  }

  public GamePosicao(Game game, GameLista gamelista,int posicao) {
    id.setGame(game);
    id.setGameLista(gamelista);
    this.posicao = posicao;
  }

  //Metodos Get Set
  public GameposicaoPK getId() {
    return id;
  }

  public void setId(GameposicaoPK id) {
    this.id = id;
  }

  public int getPosicao() {
    return posicao;
  }

  public void setPosicao(int posicao) {
    this.posicao = posicao;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
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
    GamePosicao other = (GamePosicao) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  
  




  

  
}
