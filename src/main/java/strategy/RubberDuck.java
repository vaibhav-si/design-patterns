package strategy;

public class RubberDuck extends Duck {
  public RubberDuck() {
    setFlyBehavior(new CantFly());
    setQuackBehavior(new Squeak());
  }

  @Override
  public void display() {
    System.out.println("looks like rubber");
  }
}
