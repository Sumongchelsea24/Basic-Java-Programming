//Abstraction
public class Demo4 {

  public static void main(String[] args) {
    Car car = new ElectricCar();
    //Car car = new FuelCar();
    car.start();
    car.accelerate();
    car.brake();

  }

}

abstract class Car {
  void start() {
    System.out.println("Car started");
  }

  abstract void accelerate();
  abstract void brake();
}

class FuelCar extends Car {
  @Override
   void accelerate() {
    System.out.println("Fuel Car is accelerating at 10Km/h ");
  }
  @Override
  void brake(){
    System.out.println("FuleCar is stopping");
  }

}

class ElectricCar extends Car {
  @Override
   void accelerate() {
    System.out.println("Electric Car is accelerating at 10Km/h ");
  }
  @Override
  void brake(){
    System.out.println("Electric Car is stopping");
  }
  
}
