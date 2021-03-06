package com.mazing.command;

import com.mazing.game.Game;
import com.mazing.game.Response;

public interface Command {
  Game getGame();

  void setGame(Game game);

  Response getResponse();

  void setResponse(Response response);

  default void execute() {
    applyEffect();
    printResponse();
    executeNext();
  }

  void applyEffect();

  default void printResponse() {
    System.out.println(getResponse());
  }

  void executeNext();
}
