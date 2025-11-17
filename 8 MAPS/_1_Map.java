
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Telusko{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Telusko [id=" + id + ", courseName=" + courseName + "]";
    }

    public Telusko(Integer id, String courseName) {
        super();
        this.id = id;
        this.courseName = courseName;
    }
    public Telusko(){
        super();
    }
    
}
public class _1_Map {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap<>();
        hm1.put(1, "Java");
        hm1.put(2,"Python");
        hm1.put(3, "C++");

        System.out.println(hm1);
        System.out.println("------------------------------------------");
        Telusko t = new Telusko(1,"java");
        HashMap hm2 = new HashMap<>();
        hm2.put("Alien", "Java");
        hm2.put(t, "Spring"); // key-value
        hm2.put(4, "Micro");
        hm2.put(4, "Micro"); // key must be unique
        hm2.put(5, "Micro"); //  and value need not to be unique
        hm2.put(null,"Python"); // key can be null
        hm2.put(6, null); // value can also be null
        System.out.println(hm2); // no order of insertion is maintained

        System.out.println("------------------------------------------");

        LinkedHashMap hm3 = new LinkedHashMap<>(); // child class of hashmap
        hm3.put("Alien", "Java");
        hm3.put(t, "Spring"); 
        hm3.put(4, "Micro");
        hm3.put(4, "Micro"); 
        hm3.put(5, "Micro"); 
        hm3.put(null,"Python"); 
        hm3.put(6, null);
        System.out.println(hm3);  // insertion order is preserved

        System.out.println("------------------------------------------");

        HashMap<Integer,String> hm4 = new HashMap<>(); // key as Integer and value as String
        hm4.put(1,"Java");
        hm4.put(2,"Spring");
        hm4.put(3,"Micro");
        hm4.put(4,"JDBC"); // key value pairs together are called Entry
        //hm4.put("KEY","Java");
        System.out.println(hm4);

        System.out.println("------------------------------------------");

        Hashtable ht = new Hashtable<>();
        ht.put(1,"Alien");
        ht.put(2,"Java");
        ht.put(3,"India");
        ht.put(4,"Capgemini");
        // ht.put(null,"Alien"); // cannot have key as null
        // ht.put("ABC",null); // cannot havevalue as null
        System.out.println(ht);

        System.out.println("------------------------------------------");

        TreeMap tm = new TreeMap(); // sorted order based on key
        tm.put(1, "Hibernate");
        tm.put(10,"Alien");
        tm.put(2,"Java");
        tm.put(3,"India");
        tm.put(4,"Capgemini");
        // tm.put(null,"Alien"); key cannot be null
        //tm.put("ABC",null); // value can be null
        // this line was throwing error because key was String
        System.out.println(tm);
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _1_Map PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program demonstrates the behavior of different Map implementations  
(HashMap, LinkedHashMap, Hashtable, TreeMap) and how they handle keys,  
values, ordering, nullability, and custom object keys (Telusko).  
It prints each map so the ordering and rules of each map type can be observed.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) HashMap  
    - Stores key–value pairs with no guaranteed order.  
    - Allows one null key and multiple null values.

(2) LinkedHashMap  
    - Same as HashMap but maintains insertion order.  
    - Allows null keys and null values.

(3) Hashtable  
    - Legacy synchronized map.  
    - Does NOT allow null keys or null values.  
    - Order is not preserved.

(4) TreeMap  
    - Stores entries in sorted order according to keys.  
    - Keys must be mutually comparable.  
    - Null keys are not allowed.

(5) Custom Key Objects (Telusko)  
    - Demonstrates that user-defined objects can be used as keys.  
    - Uses default Object hashCode() and equals(), meaning each Telusko instance  
      is treated as a unique key unless overridden.

(6) Map.put(key, value)  
    - Adds an entry to the map.  
    - Overwrites the value if the key already exists.

3. USAGE OF THESE CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------------

• HashMap hm1  
  - Demonstrates basic insertion of Integer keys and String values.

• HashMap hm2  
  - Demonstrates:
        → custom Telusko object as a key  
        → duplicate key overwriting (4, "Micro")  
        → null key allowed  
        → null value allowed  
        → no ordering guarantee  

• LinkedHashMap hm3  
  - Same entries as hm2 but prints in insertion order.

• HashMap<Integer, String> hm4  
  - Shows how specifying generic types enforces key/value types at compile time.  
  - Prevents incorrect types like hm4.put("KEY", "Java").

• Hashtable ht  
  - Demonstrates a synchronized map.  
  - Null key/value insertions commented out because they would cause exceptions.

• TreeMap tm  
  - Shows that entries are sorted by key.  
  - Null keys are not allowed (commented examples).  
  - Shows that mixing incompatible key types leads to errors (commented).

4. PURPOSE OF VARIABLES, METHODS, STRUCTURES
---------------------------------------------

• Telusko fields  
    id         → identifies a course  
    courseName → name of the course

• Telusko constructors  
    - Initialize Telusko objects (used as keys in maps).

• Telusko getters/setters  
    - Access and modify the object fields if necessary.

• Telusko.toString()  
    - Makes printed Telusko objects readable when printed as map keys.

• hm1  
    - Basic HashMap storing simple key-value pairs.

• hm2  
    - HashMap showing custom keys, duplicate keys, and null handling.

• hm3  
    - LinkedHashMap showing guaranteed insertion order.

• hm4  
    - Type-safe HashMap using generics.

• ht  
    - Hashtable showing synchronized map behavior and null restrictions.

• tm  
    - TreeMap demonstrating sorted ordering of map entries.

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program enters main().  
(2) hm1 is created and populated with Integer keys ⇒ printed (unordered).  
(3) Telusko object t is created.  
(4) hm2 is created and populated with:
        - a String key  
        - the Telusko object as a key  
        - duplicate key 4  
        - null key and null value  
    hm2 is printed (unordered).  
(5) hm3 is created with similar entries but printed in insertion order.  
(6) hm4 is created with Integer keys and String values ⇒ printed.  
(7) ht is created and populated; printed showing no null values allowed.  
(8) tm is created and populated; printed in sorted key order.  
(9) Program ends.

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

• HashMap (hm1)  
  Prints entries in random/unpredictable order, for example:
    {1=Java, 2=Python, 3=C++}

• HashMap (hm2)  
  Prints entries without insertion order, e.g.:
    {null=Python, 5=Micro, 4=Micro, Alien=Java, Telusko [id=1, courseName=java]=Spring, 6=null}

• LinkedHashMap (hm3)  
  Prints entries in insertion order:
    {Alien=Java, Telusko [id=1, courseName=java]=Spring, 4=Micro, 5=Micro, null=Python, 6=null}

• HashMap hm4  
  Prints entries in unspecified order:
    {1=Java, 2=Spring, 3=Micro, 4=JDBC}

• Hashtable ht  
  Prints entries in unspecified order (no nulls allowed):
    {4=Capgemini, 3=India, 2=Java, 1=Alien}

• TreeMap tm  
  Prints entries sorted by key:
    {1=Hibernate, 2=Java, 3=India, 4=Capgemini, 10=Alien}

----------------------------------------------------------- */
