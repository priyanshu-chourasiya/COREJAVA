interface Calc {
    void add(int a, int b); // method takes two arguments
    void sub(int a, int b);
}

class MyCalc1 implements Calc {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

class MyCalc2 implements Calc {
    public void add(int a, int b) {
        System.out.println("Sum (MyCalc2) = " + (a + b + 100));
    }

    public void sub(int a, int b) {
        System.out.println("Difference (MyCalc2) = " + (a - b - 100));
    }
}

class Algebra {
    public void cal(Calc c, int a, int b) {
        c.add(a, b);
        c.sub(a, b);
    }
}

public class _2_Interface {
    public static void main(String[] args) {
        MyCalc1 cal1 = new MyCalc1();
        MyCalc2 cal2 = new MyCalc2();

        Algebra a = new Algebra();
        a.cal(cal1, 20, 10);
        a.cal(cal2, 12, 12);

        //Calc c = new Calc();
    }
}
/*
 * through interface we can acheive 100% abstraction
 * interface can be used to specify a requirement which to be implemented 
 * it helps to standardization
 * all the mehtods in an interface are public and abstract irrespective we specify or not
 * it is compulsary for an implementing class to override all methods of an interface
 * if implementing class is not overriding all the methods of an interface then it must be declared as abstract
 * one interface can have any number of implementing classes 
 * we cannot create object of an interface
 * we can create reference of an interface to acheive polymorphism
 * a class will implement an interface using 'implements' keyword
 * a class can implement multiple interfaces
 * a class can extends another class and can also implements one or more interfaces at a time
 * first it must extends a class then implement interface
 */
