
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // target
@interface CricketPlayer{ // annotation
    String country();
    int age();
}//@ this specifies the compiler that annotation type is being created

//Virat kohili is a cricket player who lives in India and play for India
@CricketPlayer(country="India", age = 35)
class Viratkohili{
    private int innigs;

    public Viratkohili(){

    }

    public int getInnigs() {
        return innigs;
    }

    public void setInnigs(int innigs) {
        this.innigs = innigs;
    }

}
public class _4_Annotation {
    public static void main(String[] args) {
        Viratkohili vk = new Viratkohili();
        vk.setInnigs(44);
        System.out.println(vk.getInnigs());
    }
}
/*
PROGRAM SUMMARY
The program defines a custom annotation, applies it to a class, and demonstrates that the class functions normally at runtime even when annotated. The annotation itself is configured to be retained at runtime and applicable to types. The executed portion of the program instantiates the annotated class, sets a private field through a setter, and prints its value.

IMPORTANT CONCEPTS IN THIS CODE
1. Custom Annotation (CricketPlayer)
   - A user-defined metadata construct with specified elements (country, age).
   - Used here to attach descriptive information to a class.

2. @Retention(RetentionPolicy.RUNTIME)
   - Determines how long the annotation is retained.
   - Specifies that CricketPlayer remains available for runtime reflection.

3. @Target(ElementType.TYPE)
   - Restricts where the annotation can be applied.
   - Limits CricketPlayer to being used on classes, interfaces, or enums.

4. Annotation Elements
   - The values required when applying the annotation.
   - country() and age() serve as metadata fields associated with the type.

STRUCTURE AND ELEMENT PURPOSES
1. @interface CricketPlayer
   - Defines a custom annotation type containing two required elements.

2. String country()
   - Annotation element representing the player's country metadata.

3. int age()
   - Annotation element representing the player’s age metadata.

4. class Viratkohili
   - The annotated class representing a cricket player.
   - Receives country="India" and age=35 as metadata through the CricketPlayer annotation.

5. private int innigs
   - Instance variable storing the innings count for a Viratkohili object.

6. Viratkohili() constructor
   - Default constructor; initializes the object without modifying innigs.

7. setInnigs(int innigs)
   - Assigns a value to the innigs field.

8. getInnigs()
   - Returns the current innigs value.

9. public class _4_Annotation
   - Contains the main entry point.

10. main method
    - Creates a Viratkohili object, sets its innigs value, and prints it.

11. Variable: Viratkohili vk
    - Holds the instantiated Viratkohili object used to demonstrate field access.

CONTROL FLOW (START TO END)
1. Program enters main.
2. Instantiates a Viratkohili object and assigns it to vk.
3. Invokes vk.setInnigs(44), storing 44 in the innigs field.
4. Calls vk.getInnigs(), retrieves 44, and prints it.
5. Program terminates.

EXECUTION BEHAVIOR AND OUTPUT
44
*/
