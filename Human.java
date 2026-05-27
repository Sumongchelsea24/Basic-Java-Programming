class Human{
  
    int age;
    String name;
    String address;

    Human(){
        super();

    }

    public Human(int age,String name,String address) {
        this.age=age;
        this.name=name;
        this.address=address;

    }

    

    void walk(){
        System.out.println("Human is walking");

    }
    void run(){
        System.out.println("Human is running");
    }
    void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.address);
    }


    public static void main(String[] args) {
        Human h= new Human(21,"Lalit Singh","Gorkha");
        System.out.println(h.age +" "+h.name +" "+ h.address);
        h.printInfo();

        Human h1= new Human();
        h1.age=23;
        h1.name="Hira Lal";
        h1.address="Kathmandu";
        h1.printInfo();

        System.out.println(h1.age +" "+h1.name +" "+ h1.address);
        h.walk();
        h.run();
        
    }
}