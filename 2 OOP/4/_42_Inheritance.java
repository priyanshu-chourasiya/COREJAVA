class Demo{
    static int a;
    public static void display(){
        a = 10;
        System.out.println(a);
    }
}
class Demo2 extends Demo{
    public static void display(){ // method hiding 
        a = 10;
        System.out.println(a + " Child class display");
    }
}
public class _42_Inheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();
        Demo2.display();
    }
}
// we can inherit static methods but we cannot override
/*
 * static methods do get inherited 
 * but whenever we try to override static methods in child class it will hide the parent 
 * class static method it will behave like a specialized method of child class (overriding would not occur)
 * we cannot override the static methods in child class
 */