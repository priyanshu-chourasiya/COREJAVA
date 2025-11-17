// class Person{
//     public void getDetails(){
//         System.out.println("Priyanshu");
//     }

//     class Phone{ // we can have inner class static
//         public void getDetails2(){
//         System.out.println("samsung");
//     }
//     }
// }

class A{
    public void show(){
        System.out.println("In A class");
    }
    public void display(){
        System.out.println("In A class display method");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("In B class");
//     }
// }
public class _9_Lambda {
    public static void main(String[] args) {
        A obj = new A(){  // Anonmous inner class
            public void show(){  // we can use only once
                System.out.println("In new show");
            }
            public void display(){
                System.out.println("New display");
            }
            public void newMethod(){
                System.out.println("New method in object");
            }
        };
        obj.show();
        obj.display();
        //obj.newMethod(); we can create new method in anonmous but we cannot access it 

        new A().show();
        

        new A(){  // Anonmous inner class
            public void show(){  // we can use only once
                System.out.println("In new show");
            }
            public void display(){
                System.out.println("New display");
            }
            public void newMethod(){
                System.out.println("New method in object");
            }
        }.newMethod();
    }
}
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: Anonymous Inner Class
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **anonymous inner classes** in Java.  
It shows how to create a subclass of an existing class (`A`) on-the-fly without naming it.  
It highlights method overriding and the limitation of accessing new methods defined only in the anonymous class.

2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

ANONYMOUS INNER CLASS  
- A class without a name, defined and instantiated in a single expression  
- Can **override methods** of the superclass or interface  
- Cannot add new methods to be accessed through the reference of the superclass  
- Usually used when you need a one-time use class  

METHOD OVERRIDING  
- Provides a new implementation for an inherited method in the subclass  

3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

`A obj = new A(){ ... };`  
- Creates an **anonymous subclass of A**  
- Overrides `show()` and `display()`  
- Adds a new method `newMethod()` (cannot be accessed via reference `obj` of type `A`)  

`new A().show();`  
- Creates a normal instance of `A` and calls its original `show()`  

`new A(){ ... }.newMethod();`  
- Instantiates an anonymous class and immediately calls its **own new method**  
- Allowed only because the object reference is not stored; method is called immediately  

4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`obj` → reference of type `A` pointing to an anonymous subclass object  
`show()` → overridden in anonymous class to print "In new show"  
`display()` → overridden to print "New display"  
`newMethod()` → new method defined in anonymous class (not accessible via `A` type reference)  

5. CONTROL-FLOW EXPLANATION
---------------------------

① `A obj = new A(){ ... };` → create anonymous subclass object  
② `obj.show();` → calls overridden method → prints "In new show"  
③ `obj.display();` → calls overridden method → prints "New display"  
④ `new A().show();` → normal object → prints "In A class"  
⑤ `new A(){ ... }.newMethod();` → creates anonymous object and calls `newMethod()` → prints "New method in object"  

6. EXPECTED OUTPUT
-----------------
In new show
New display
In A class
New method in object

7. ADDITIONAL NOTES
-------------------
- Anonymous inner classes are used for **one-time customization** of a class or interface  
- Cannot be reused; cannot define a constructor in an anonymous class  
- You cannot access new methods through a reference of the parent type  
- Commonly used for GUI listeners, callbacks, and thread implementations  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
