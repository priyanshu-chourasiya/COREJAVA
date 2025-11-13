//package 2 OOP;

class Student{
    String name;
    int age;
    int id;

    void studying(){
        System.out.println("STUDYING");
    }

    void playing(){
        System.out.println("PLAYING");
    }

}

public class _1_First {
        public static void main(String[] args) {
            Student s1 = new Student(); // instaniation of a class
            s1.studying();
            s1.playing();

        }  
}
