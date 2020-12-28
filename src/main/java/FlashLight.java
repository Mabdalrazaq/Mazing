public class FlashLight extends Item {

  private static FlashLight instance;

  private FlashLight() {
  }

  public static synchronized FlashLight getInstance() {
      if (instance == null) {
          instance = new FlashLight();
      }
    return instance;
  }

  @Override
  public ItemType getType() {
    return ItemType.FLASHLIGHT;
  }

  @Override
  public Response use(Game game) {
    game.getCharacter().setFlashLightOn(!game.getCharacter().isFlashLightOn());
    return new Response(ResponseType.SUCCESS,
        "Your flashlight is " +
            (game.getCharacter().isFlashLightOn() ? "ON" : "OFF"));
  }


}
