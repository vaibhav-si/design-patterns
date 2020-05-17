package strategy;

public class DecoyDuck extends Duck {
  public DecoyDuck() {
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new Mute());
  }

  @Override
  public void display() {
    System.out.println("decoy");
  }
}
