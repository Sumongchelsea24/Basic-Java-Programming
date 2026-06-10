public class Demo22 {
  public static void main(String[] args) {

    PaymentStatus status = PaymentStatus.SUCCESS;
    System.out.println(status.name());

  }

}
//Enum-->Enumerations(Enumerated type)
//Enum--> Predefined set of constants.

enum PaymentStatus {
  SUCCESS,
  FAILED,
  PENDING;
}
