// Constructor overloading in Java
public class Oop3 {

  public static void main(String[] args) {
    Car c1 = new Car();
    System.out.println(c1.brand + ", " + c1.model + ", " + c1.year);
    c1.start();
    c1.stop();

    Car c2 = new Car("Tesla");
    System.out.println(c2.brand + ", " + c2.model + ", " + c2.year);
    c2.start();
    c2.stop();
  

    Car c3 = new Car("Honda", "Civic");
    System.out.println(c3.brand + ", " + c3.model + ", " + c3.year);
    c3.start();
    c3.stop();

    Car c4 = new Car("Ford", "Mustang", 2021);
    System.out.println(c4.brand + ", " + c4.model + ", " + c4.year);
    c4.start();
    c4.stop();

  }

}
class Car {
  String brand;
  String model;
  int year;

  Car() {
    //default constructor --> used to initialize the instance variable with default value
    brand = "Toyota";
    model = "Corolla";
    year = 2020;
  }

  Car(String brand) {
    this(brand, "Unknown", 2020); //calling the parameterized constructor with default values for model and year  
  }
  
  Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
    this.year = 2020; //default value for year
  }

  Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  void start() {
    System.out.println("Car is starting");
  }

  void stop() {
    System.out.println("Car is stopping");
  }
}
