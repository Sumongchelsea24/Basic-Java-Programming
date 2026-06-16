public class Demo43 {

  public static void main(String[] args) {
    // invariant in generics
    Animal animal = new Dog();
    animal.eat();
    animal.walk();

  }
}

class Animal {
  void eat() {
    System.out.println("Eating");

  }

  void walk() {
    System.out.println("Walking");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Barking");
  }
}