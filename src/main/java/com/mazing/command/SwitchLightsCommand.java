package com.mazing.command;
import com.mazing.item.*;
import com.mazing.map.*;
import com.mazing.game.*;
import com.mazing.wall.*;

public class SwitchLightsCommand extends MainCommand {


  @Override
  public void applyEffect() {
    if (getGame().getCurrentRoom().isThereLight()) {
      getGame().getCurrentRoom().toggleLight();
      setResponse(new Response(ResponseType.SUCCESS,
          "Lights are " +
              (getGame().getCurrentRoom().isLightOn() ? "ON" : "OFF")));;
    }
    else{
      setResponse(new Response(ResponseType.FAILURE,
          "There are no lights in this room") );
  }
}

}