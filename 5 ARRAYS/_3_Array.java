class Alien{
    int id;
    String name;
    String course;
}
public class _3_Array {
    public static void main(String[] args) {
        Alien []arr = new Alien[3];

        arr[0] = new Alien();
        arr[1] = new Alien();
        arr[2] = new Alien();

        arr[0].id = 1;
        arr[0].name = "Rohan";
        arr[0].course = "Java";

        System.out.println(arr[0].id);
        System.out.println(arr[0].name);
        System.out.println(arr[0].course);

        System.out.println(arr[0]);
    }
}
/*
===========================================================
REVISION NOTES – ARRAY OF OBJECTS (Class + Array)
===========================================================

-----------------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------------
• Creates a class called Alien with three fields.
• Creates an array of Alien objects.
• Allocates memory for each object.
• Stores data in object fields.
• Prints the values.

-----------------------------------------------------------
2. IMPORTANT CONCEPTS USED IN THE CODE
-----------------------------------------------------------

-----------------------------------------------------------
A) Class (User-Defined Type)
-----------------------------------------------------------
DEFINITION:
• A blueprint/template that defines properties and behavior.
• Here, the class Alien contains 3 fields:
      int id;
      String name;
      String course;

USAGE:
• Used to create objects that store data for each Alien.

WHY USED HERE:
• To demonstrate how arrays can hold objects instead of primitives.

-----------------------------------------------------------
B) Object Creation (new keyword)
-----------------------------------------------------------
DEFINITION:
• new allocates memory for an object and returns its reference.

USAGE:
      arr[0] = new Alien();

WHY NEEDED:
• Even though the array is created:
      Alien[] arr = new Alien[3];

  This ONLY creates storage for references (null initially).
  
• Each element must be initialized separately using new.

-----------------------------------------------------------
C) Array of Objects
-----------------------------------------------------------
DEFINITION:
• An array where each element is an object reference.

USAGE:
      Alien[] arr = new Alien[3];

WHY USED:
• To store multiple Alien objects in sequential order.

IMPORTANT:
• arr = [ null , null , null ]
  until you do:
      arr[i] = new Alien();

-----------------------------------------------------------
D) Dot Operator (.)
-----------------------------------------------------------
DEFINITION:
• Used to access fields or methods of an object.

USAGE:
      arr[0].id = 1;

WHY USED:
• To store data inside the object’s fields.

-----------------------------------------------------------
E) Printing Object Reference
-----------------------------------------------------------
When printing:
      System.out.println(arr[0]);

OUTPUT:
      Alien@3f0ee7cb (something like this)

WHY?
• Because print() shows the "toString()" representation.
• Default toString() = className@hashcode

-----------------------------------------------------------
3. CODE FLOW (Step-by-Step)
-----------------------------------------------------------

1) Create array of references:
      Alien[] arr = new Alien[3];

2) Initialize each element:
      arr[0] = new Alien();
      arr[1] = new Alien();
      arr[2] = new Alien();

3) Assign data to first object:
      arr[0].id = 1;
      arr[0].name = "Rohan";
      arr[0].course = "Java";

4) Print the fields:
      1
      Rohan
      Java

5) Print object reference (memory address-like output).

-----------------------------------------------------------
4. IMPORTANT NOTES
-----------------------------------------------------------
• Array of class type stores **references**, not objects.
• You MUST allocate each object separately.
• Uninitialized elements will cause:
      NullPointerException
• Default toString() only prints reference value.

-----------------------------------------------------------
5. DIAGRAM (Memory Visualization)
-----------------------------------------------------------

arr  →  [ ref0 ] [ ref1 ] [ ref2 ]

ref0 →  Alien object with (id=1, name="Rohan", course="Java")
ref1 →  Alien object (fields default values)
ref2 →  Alien object (fields default values)

===========================================================
END OF NOTES
===========================================================
*/
