package strategy;

public abstract class Duck {
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public void swim() { System.out.println("All ducks can swim"); }

  public void display() { System.out.println("Default display"); }

  public void fly() { flyBehavior.fly(); }

  public void quack() { quackBehavior.quack(); }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
