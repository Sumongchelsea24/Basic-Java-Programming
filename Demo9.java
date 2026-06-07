public class Demo9 {
  public static void main(String[] args) {
    Animal a = new Dog();
    a.makeSound();
  }
}

abstract class Animal {
  abstract void makeSound();

  void sleep() {
    System.out.println("Sleeping");
  }
}

class Dog extends Animal {
  
  @Override
  void makeSound() {
    System.out.println("Making barking sound");
  }
}
