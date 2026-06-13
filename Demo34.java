public class Demo34 {
  public static void main(String[] args) {
    // String s1 = new String("Sujan");
    // Length/Emptiness
    // System.out.println(s1.length());//5
    // System.out.println(s1.isEmpty());// false
    // System.out.println(s1.isBlank());//false

    // String s2 = new String("Hari");
    // Character access
    // System.out.println(s2.charAt(2));
    // char[] arr=s2.toCharArray();

    // Comparison
    // String s1 = new String("Hariya");
    // String s2 = new String("Hariya");

    // equals --> == --> Reference compare
    // System.out.println(s1.equals(s2));// true
    // System.out.println(s1.equalsIgnoreCase(s2));

    // lexicographical comparison -- Dictionary
    // System.out.println(s1.compareTo(s2));

    // searching
    // System.out.println(s1.contains("riya"));// true
    // System.out.println(s1.indexOf('i'));// 3
    // System.out.println(s1.lastIndexOf("iya"));
    // System.out.println(s1.startsWith("Ha"));

    // Extraction /transformation
    // substring->[)
    // System.out.println(s1.subString(1, 4));
    // System.out.println(s1.trim());
    // System.out.println(s1.strip());// unicode friendly
    // System.out.println(s1.repeat(3));
    // System.out.println(s1.replace("iya", "ism"));
    // System.out.println(s1.replaceAll("Ha", "Sa"));

    // String s3 = "Sukhiya,Mukhiya,Hariya ";
    // String[] arr = s3.split("-");
    // for (String s : arr) {
    // System.out.print(s);
    // }
    // System.out.println( String.join("-", "a", "b", "c"));//a-b-c

    // Conversion
    // String s1 = "Hello Everyone";
    // String s4 = new String(String.valueOf(10));
    // byte[] arr = s1.getBytes();
    // for (byte i : arr) {
    // System.out.print(i + ",");

    // }
    // Advance -->intern(),format()
    // String s5 = new String("Hello");
    // String s6 = s5.intern();

    // System.out.println(s5 == s6);

    // format
    String name = "Sulav";
    int age = 28;

    // Hello Aditya,your age is 28;
    System.out.println("Hello" + " " + name + "," + " " + "your age is" + " " + age);
    System.out.println(String.format("Hello %s ,your age is %s", name, age));

  }

}