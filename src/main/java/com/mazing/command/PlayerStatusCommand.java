package com.mazing.command;

import com.mazing.game.Response;
import com.mazing.game.ResponseType;

public class PlayerStatusCommand extends MainCommand {

  @Override
  public void applyEffect() {
    setResponse(
        new Response(
            ResponseType.STATUS,
            "Player is facing: "
                + getGame().getDirection()
                + "\n"
                + getGame().getGold()
                + "\n"
                + "Items: "
                + getGame().getCharacterItems()));
  }
}
