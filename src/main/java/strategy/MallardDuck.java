package strategy;

public class MallardDuck extends Duck {

  public MallardDuck() {
    setFlyBehavior(new FlyWithWings());
    setQuackBehavior(new Squeak());
  }

  @Override
  public void display() {
    System.out.println("looks like mallard");
  }
}
