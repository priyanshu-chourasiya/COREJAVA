// class A{
//     public void show(){
//         System.out.println("In A class");
//     }
// }
// class B extends A{
//     public void show(){
//         System.out.println("In B class");
//     }
// }
/** 
 * this is java documentation
 * 
 **/
class Person{
    public void getDetails(){
        System.out.println("Priyanshu");
    }

    static class Phone{ // we can have inner class static
        public void getDetails2(){
        System.out.println("samsung");
    }
    }
}
public class _7_Lambda {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj2 = new B();
        // obj2.show();

        Person p = new Person();
        p.getDetails();
        // Phone ph = new Phone(); //not possible
        Person.Phone ph = new Person.Phone();
        ph.getDetails2();
        //
    }
}
// /*
// ------------------------------------------------------------
// REVISION NOTES FOR PROGRAM: Static Nested Class
// ------------------------------------------------------------

// 1. OVERALL PROGRAM PURPOSE
// --------------------------
// This program demonstrates the use of **static nested classes** in Java.  
// It shows how to define and access a static inner class (`Phone`) within an outer class (`Person`).  
// It also briefly illustrates basic class method invocation.

// 2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
// ------------------------------------------

// STATIC NESTED CLASS  
// - Declared with `static` inside an outer class  
// - Can be instantiated **without an instance of the outer class**  
// - Does not have direct access to non-static members of the outer class  

// JAVA DOCUMENTATION COMMENT  
// - `/** ... */`  
// - Used for generating JavaDoc  
// - Describes classes, methods, and fields  

// 3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
// ------------------------------------------

// `Person` class → outer class  
// - Method: `getDetails()` → prints name "Priyanshu"  

// `Person.Phone` → static nested class  
// - Method: `getDetails2()` → prints phone brand "samsung"  

// INSTANTIATION  
// - Outer class object: `Person p = new Person();` → allows access to `getDetails()`  
// - Static nested class object: `Person.Phone ph = new Person.Phone();` → allows access to `getDetails2()`  

// 4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
// --------------------------------------------

// `getDetails()` → prints details of the person  
// `getDetails2()` → prints details of the phone  
// `Person.Phone` → static inner class to logically group related functionality (phone info) with outer class  

// 5. CONTROL-FLOW EXPLANATION
// ---------------------------

// ① `Person p = new Person();` → create outer class instance  
// ② `p.getDetails();` → prints "Priyanshu"  
// ③ `Person.Phone ph = new Person.Phone();` → create static nested class instance  
// ④ `ph.getDetails2();` → prints "samsung"  

// 6. EXPECTED BEHAVIOR/OUTPUT
// --------------------------
// Priyanshu
// samsung

// 7. ADDITIONAL NOTES
// -------------------
// - Static nested classes can be instantiated without outer class objects  
// - Useful for logically grouping classes that are only relevant to the enclosing class  
// - Unlike inner (non-static) classes, static nested classes **cannot access non-static members of the outer class directly**  
// - JavaDoc comments are ignored by the compiler but can generate API documentation  

// ------------------------------------------------------------
// END OF REVISION NOTES
// ------------------------------------------------------------
// */
