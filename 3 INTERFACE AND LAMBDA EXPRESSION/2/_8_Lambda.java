class Person{
    public void getDetails(){
        System.out.println("Priyanshu");
    }

    class Phone{ // we can have inner class static
        public void getDetails2(){
        System.out.println("samsung");
    }
    }
}
public class _8_Lambda {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj2 = new B();
        // obj2.show();

        Person p = new Person();
        p.getDetails();
        // Phone ph = new Phone(); //not possible
        Person.Phone ph = p.new Phone();
        ph.getDetails2();
    }
}
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: Inner (Non-Static) Class
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of a **non-static inner class** in Java.  
It shows how to define an inner class (`Phone`) inside an outer class (`Person`) and access it via an instance of the outer class.  
It contrasts with static nested classes by requiring an instance of the outer class to instantiate the inner class.

2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INNER CLASS (NON-STATIC)  
- Defined inside another class without the `static` keyword  
- Each inner class instance is **associated with an instance of the outer class**  
- Can access **both static and non-static members** of the outer class  

OUTER CLASS (`Person`)  
- Contains `getDetails()` method to display person's name  
- Contains inner class `Phone`  

INSTANTIATION OF INNER CLASS  
- Must use the outer class object: `OuterClass.InnerClass innerObj = outerObj.new InnerClass();`  

3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

`Person` class → outer class  
- `getDetails()` → prints "Priyanshu"  

`Phone` class → inner class (non-static)  
- `getDetails2()` → prints "samsung"  

`Person p = new Person();` → creates an outer class instance  
`Person.Phone ph = p.new Phone();` → creates inner class instance associated with `p`  

4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`getDetails()` → prints details of the person  
`getDetails2()` → prints details of the phone  
`Phone` → inner class for logically grouping phone-related behavior with its associated person  

5. CONTROL-FLOW EXPLANATION
---------------------------

① `Person p = new Person();` → create outer class instance  
② `p.getDetails();` → prints "Priyanshu"  
③ `Person.Phone ph = p.new Phone();` → create inner class instance linked to `p`  
④ `ph.getDetails2();` → prints "samsung"  

6. EXPECTED OUTPUT
-----------------
Priyanshu
samsung

7. ADDITIONAL NOTES
-------------------
- Inner (non-static) classes require an **outer class instance** for instantiation  
- Can access all members of the outer class, including private members  
- Unlike static nested classes, they cannot exist independently of an outer class instance  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
