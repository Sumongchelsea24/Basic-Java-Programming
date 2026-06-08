public class Demo13 {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.introduce(); 

    // Person p = new Guest();
    // p.introduce();

    //use of anonymous class
    Person p = new Person() {
      @Override
      void introduce() {
        System.out.println("Hi , I am a Guest");
      }

    };
  }

}

class Person {
  void introduce() {
    System.out.println("Hi, I am a person");

  }
}

// class Guest extends Person {
//   @Override
//   void introduce() {
//     System.out.println("Hi ,I am Guest");
    
//   }
// }
