
public class Demo26 {

  public static void main(String[] args) {
    // Car c = new Thar();
    // c.drive();

    Payment p = new CreditCard();
    // Payment p = new DebitCard();
    p.pay();

  }

}
// Interface use polymorphism and give us benefits dynamic dispatch or dynamic
// polymorphism
// interface Car {
// public void drive();
// }

// // class Thar implements Car {
// // @Override
// // public void drive() {
// // System.out.println("Thar is driving");

// // }
// // }

// abstract class Thar implements Car {
// abstract public void drive();
// }

// class BlackThar extends Thar {
// @Override
// public void drive() {
// }
// }
interface Payment {
  void pay();
}

class CreditCard implements Payment {
  @Override
  public void pay() {
    System.out.println("Paying via credit card");
  }
}

class DebitCard implements Payment {
  @Override
  public void pay() {
    System.out.println("Paying via debit card");
  }
}