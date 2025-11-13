//package 2 OOP;

class Calculator{
    int num1;  // instance variable default value 0 if boolean then false if string then null double 0.0
    int num2;

    int o;
    void add(){
        num1 = 10;
        num2 = 20;
        int res = num1 + num2; // local variable
        System.out.println(res);
    }
    void sum(){
        int res = num1-num2;
        int n;
        System.out.println(res);
        System.out.println(n);
        System.out.println(o);
    }
}

public class _2_Second {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        for(int i = 0;i < 4;i++){
            System.out.println(i);
        }
        // i = 10
    }
}

// instance variable are directly declared inside a class
//                   memory is allocated inside heap area within object/instance
// instance = object
//                   memory is deallocated by garbage collector when object becomes referenceless
//                   
// local variable are directly declared inside a method/block/loop within a class
// memory is allocated is stack area
// memory is deallocted is stack frame of that method/block/loop is deallocated after completing its task

// scope in instance variable can be used anywhere within the class
// scope of local variables are limited to method/block/loop where it is decalred