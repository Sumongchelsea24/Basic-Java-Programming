public class Student {

    int studentId;
    String studentName;
    String studentAddress;

    Student(){
        super();

    }

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    void study(){
        System.out.println("Student is studying");
    }

    void attendClass(){
        System.out.println("Student is attending class");
    }

    void printInfo(){
        System.out.println(this.studentId);
        System.out.println(this.studentName);
        System.out.println(this.studentAddress);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Ram Kumar", "Lalitpur");
        System.out.println(s.studentId + " " + s.studentName + " " + s.studentAddress);
        s.printInfo();

        Student s1 = new Student();
        s1.studentId = 102;
        s1.studentName = "Sita Devi";
        s1.studentAddress = "Bhaktapur";
        s1.printInfo();

        System.out.println(s1.studentId + " " + s1.studentName + " " + s1.studentAddress);
        s.study();
        s.attendClass();
    }


    
}
