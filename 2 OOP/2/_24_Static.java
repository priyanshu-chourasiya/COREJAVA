class Demo2{
    static int a,b,c;   // static variables can be accessed in static blocks and variables // class variables
    //static int b;
    int x,y,z; 
    
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

    { // java initialization block
        x = 44;
        y = 45;
        z = 90;
        System.out.println("Java initializtion block");
    }

    Demo2(){
        System.out.println("Constructor");
    }

    void display2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class _24_Static {
    public static void main(String[] args) {
        Demo2.display();

        Demo2 d2 = new Demo2();
        d2.display2();
    }
}
