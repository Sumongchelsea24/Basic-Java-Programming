public class Demo28 {
  public static void main(String[] args) {

  }
}
// Multipe Inheritance--supported through interfaces

interface Animal {
  void eat();

}

interface Dog extends Animal {
  void bark();

}

class StreetDog implements Dog {

  @Override
  public void eat() {
    System.out.println("Eating");
  }

  @Override
  public void bark() {
    System.out.println("Barking");
  }

}