class Tel {
   private String courseName;
   private int courseCost;
   private String city;

    public Tel(String city, int courseCost, String courseName) {
        this.city = city;
        this.courseCost = courseCost;
        this.courseName = courseName;
    }
   public String getCourseName() {
    return courseName;
   }
   public void setCourseName(String courseName) {
    this.courseName = courseName;
   }
   public int getCourseCost() {
    return courseCost;
   }
   public void setCourseCost(int courseCost) {
    this.courseCost = courseCost;
   }
   public String getCity() {
    return city;
   }
   public void setCity(String city) {
    this.city = city;
   }

   public Tel(){
    super();
   }
   @Override
   public String toString() {
    return "Tel [courseName=" + courseName + ", courseCost=" + courseCost + ", city=" + city + "]";
   }
}

public class _8_Array {
    public static void main(String[] args) {
        Tel t = new Tel("Banglore",3000,"Sprint boot");
        // System.out.println(t.getCourseCost());
        // System.out.println(t.getCity());
        // System.out.println(t.getCourseName());

        System.out.println(t);
    }
}
/*
====================================================================
REVISION NOTES – CLASS WITH ENCAPSULATION, CONSTRUCTORS & toString()
====================================================================

------------------------------------------------------------
1. WHAT THE PROGRAM DOES
------------------------------------------------------------
• Defines a Tel class with private fields: courseName, courseCost, and city.
• Provides getters, setters, constructors, and an overridden toString().
• Creates a Tel object in main() and prints it.
• Printing the object automatically calls toString() and displays its data.

------------------------------------------------------------
2. CONCEPTS USED (ONLY THOSE PRESENT IN THE CODE)
------------------------------------------------------------

A) Class  
   • A blueprint for creating objects.

B) Private Variables  
   • courseName, courseCost, city  
   • Accessible only inside the Tel class.

C) Encapsulation  
   • Uses getters and setters to access/modify private variables.

D) Constructor  
   • Special method used to initialize objects.
   • Tel(String city, int courseCost, String courseName)
   • Tel() default constructor (calls super() implicitly).

E) this Keyword  
   • Refers to the current object’s fields.
   • Used to assign constructor parameters to object variables.

F) Method Overriding  
   • toString() method overridden to provide custom object representation.

G) Object Creation  
   • Tel t = new Tel(...)

H) System.out.println(t);  
   • Automatically triggers t.toString().

------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
------------------------------------------------------------

A) Private Variables  
   • Store internal data for each Tel object.

B) Parameterized Constructor  
   • Assigns incoming values to object fields using this.city, this.courseCost, this.courseName.

C) Default Constructor  
   • Exists for situations where no initial values are passed.
   • Calls super() (Object class constructor).

D) Getter Methods  
   • getCourseName(), getCourseCost(), getCity()  
   • Return the values of private fields.

E) Setter Methods  
   • setCourseName(), setCourseCost(), setCity()  
   • Modify private fields externally in a controlled way.

F) Overridden toString()  
   • Returns a structured string:  
       "Tel [courseName=..., courseCost=..., city=...]"

G) Object Creation in main()  
   • Tel t = new Tel("Banglore",3000,"Sprint boot");  
   • Initializes Tel object with provided values.

------------------------------------------------------------
4. PURPOSE OF EACH VARIABLE / METHOD / BLOCK
------------------------------------------------------------

• courseName, courseCost, city  
  → Store the individual attributes of a Tel object.

• Tel(String city, int courseCost, String courseName)  
  → Initializes fields using provided constructor arguments.

• Tel()  
  → A no-argument constructor; provides a default way to create objects.

• Getters (getCourseName(), getCourseCost(), getCity())  
  → Used to read the private field values.

• Setters (setCourseName(), setCourseCost(), setCity())  
  → Used to modify the private field values.

• toString()  
  → Provides formatted output of the object’s state.

• main()  
  → Creates a Tel object and prints it.

------------------------------------------------------------
5. CONTROL FLOW (STEP-BY-STEP)
------------------------------------------------------------

1) Program enters main().
2) A Tel object is created using the parameterized constructor:
       "Banglore", 3000, "Sprint boot"
   → Each argument is assigned to its respective field.
3) System.out.println(t) is encountered.
4) toString() is automatically called on the Tel object.
5) String returned from toString() is printed on the console.
6) Program ends.

------------------------------------------------------------
6. EXACT RUNTIME OUTPUT
------------------------------------------------------------
Tel [courseName=Sprint boot, courseCost=3000, city=Banglore]

====================================================================
END OF NOTES
====================================================================
*/
