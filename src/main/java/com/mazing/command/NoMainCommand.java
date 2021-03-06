package com.mazing.command;

import com.mazing.game.Response;
import com.mazing.game.ResponseType;

public class NoMainCommand extends MainCommand {

  @Override
  public void applyEffect() {
    setResponse(new Response(ResponseType.INVALID, "Command not recognized"));
  }
}
