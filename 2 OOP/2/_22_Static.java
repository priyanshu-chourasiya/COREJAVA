class Demo{
    static int a,b,c;   // static variables can be accessed in static blocks and variables
    //static int b;
    //int x,y,z; we caanot do this or do use these we have to create object in main class
    
    static { // static block
        System.out.println("static inti block");
        a = 10;
        b = 20;
        c = 30;
    }
    static void display(){   
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class _22_Static {
    public static void main(String[] args) {
        Demo.display(); // no need to create any object we can call method by class
    }
}
