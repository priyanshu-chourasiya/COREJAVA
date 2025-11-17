@FunctionalInterface  // if we add more than one undeclared method in interface this will throw an error 
interface X{
    void show2();
    default void abs(){
        System.out.println("Aada"); // but we can have default 
    }
    String toString(); // already declared in Object class
}

@FunctionalInterface
interface Person{
    int add(int a,int b);
}

// class imple implements Person{
//     public int add(int a,int b){
//         return a+b;
//     }
// }
public class _12_Lambda {
    public static void main(String[] args) {
        X obj2 = () -> System.out.println("HEEEEEE");
        obj2.show2();

        // Person p1 = new Person(){
        //     public int add(int x,int y){
        //         return x+y;
        //     }
        // };

        // Person p1 = (int x,int y) -> {
        //     return x+y;
        // }; 

        Person p1 = (x,y) -> x+y; // replacement of anounmous inner class
    

        int result = p1.add(12, 11);
        System.out.println(result);
    }
}
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: @FunctionalInterface AND LAMBDA EXPRESSIONS
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- The use of **@FunctionalInterface** to enforce the single abstract method rule.
- Implementing functional interfaces using **lambda expressions**.
- Combining lambda expressions and functional interfaces to simplify code and replace anonymous inner classes.

2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

@FunctionalInterface
- Annotation used to mark an interface as a **functional interface**.
- Ensures that the interface has **exactly one abstract method**.
- Allows default and static methods without violating functional interface rules.
- Methods already declared in `Object` class (like `toString()`) are not counted as abstract methods.

DEFAULT METHOD
- A method in an interface with a **body**.
- Implementing classes are not required to override it.
- Example: `default void abs() { ... }` in interface `X`.

LAMBDA EXPRESSION
- Provides a concise way to implement a single abstract method of a functional interface.
- Syntax: `(parameters) -> expression` or `(parameters) -> { body }`.
- Can replace anonymous inner classes for functional interfaces.

FUNCTIONAL INTERFACE
- Interface with **exactly one abstract method**.
- Can contain default and static methods.
- Can be used to implement **lambda expressions**.

3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

Interface `X`:
- Abstract method: `void show2()`.
- Default method: `abs()`.
- Method from Object class: `toString()` (ignored for @FunctionalInterface count).

Interface `Person`:
- Abstract method: `int add(int a,int b)`.

Lambda expressions:
- `X obj2 = () -> System.out.println("HEEEEEE");`
    - Implements `show2()` using a lambda.
- `Person p1 = (x,y) -> x+y;`
    - Implements `add(int a,int b)` using a lambda.

4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`obj2` → reference of type `X` holding lambda implementation.  
`p1` → reference of type `Person` holding lambda implementation.  
`show2()` → abstract method of `X` executed via lambda.  
`add(int,int)` → abstract method of `Person` executed via lambda.  

5. CONTROL-FLOW EXPLANATION
---------------------------

1. `X obj2 = () -> System.out.println("HEEEEEE");` → lambda assigned to functional interface `X`.
2. `obj2.show2();` → calls lambda body → prints `"HEEEEEE"`.
3. `Person p1 = (x,y) -> x+y;` → lambda assigned to `Person`.
4. `int result = p1.add(12, 11);` → executes lambda → returns `23`.
5. `System.out.println(result);` → prints `23`.

6. EXPECTED OUTPUT
-----------------
HEEEEEE
23

7. ADDITIONAL NOTES
-------------------
- A functional interface can have:
    - One abstract method
    - Any number of default methods
    - Static methods
    - Methods from `Object` class are not counted
- Lambda expressions provide a **clean, concise implementation** for functional interfaces.
- Using lambdas reduces boilerplate code compared to anonymous inner classes.

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
