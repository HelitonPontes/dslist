package com.devsuperior.dslist.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class GameposicaoPK {

  @ManyToOne
  @JoinColumn(name ="gane_id")
  private Game  game;

  @ManyToOne
  @JoinColumn(name ="lista_id")
  private GameLista gameLista;

  public GameposicaoPK (){

  }

  //Construtores
  public GameposicaoPK(Game game, GameLista gameLista) {
    this.game = game;
    this.gameLista = gameLista;
  }

  //Metodos Gets e Sets

  public Game getGame() {
    return game;
  }

  public void setGame(Game game) {
    this.game = game;
  }

  public GameLista getGameLista() {
    return gameLista;
  }

  public void setGameLista(GameLista gameLista) {
    this.gameLista = gameLista;
  }

  
}
