class Student{
    int id;
    String name;
    String city;
    int count;
    Student() {
        System.out.println("Zero para constructor");
        count++;
    }

    Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        count++;
    }
}
public class _25_Static {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Priyanshu","Bhopal");
        System.out.println(s1.count);
        Student s2 = new Student(2,"Priya","Banglore");
        System.out.println(s2.count);
        Student s3 = new Student(3,"Pyanshu","Bho");
        System.out.println(s3.count);
    }
}
