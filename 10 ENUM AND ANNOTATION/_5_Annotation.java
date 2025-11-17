
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR}) // target
@interface CricketPlayer{ // annotation
    String country() default "India";
    //int age();
}//@ this specifies the compiler that annotation type is being created

//Virat kohili is a cricket player who lives in India and play for India
//@CricketPlayer(country="India", age = 35)
@CricketPlayer
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
public class _5_Annotation {
    public static void main(String[] args) {
        Viratkohili vk = new Viratkohili();
        vk.setInnigs(44);
        System.out.println(vk.getInnigs());

        System.out.println("----------------------------");

        Class<? extends Viratkohili > c = vk.getClass();
        CricketPlayer cp = c.getAnnotation(CricketPlayer.class);
        System.out.println(cp.country());
    }
}
// parent of all annotation is Annotation
/*
PROGRAM SUMMARY
The program defines a custom annotation with runtime retention and multi-target applicability, applies it to a class, then retrieves the annotation instance through reflection to access its element value. It also demonstrates reading default annotation values and shows normal object behavior alongside annotation usage.

IMPORTANT CONCEPTS IN THIS CODE
1. Custom Annotation (CricketPlayer)
   - Metadata type with a single element (country) that has a default value.
   - Applied to annotate classes and constructors.

2. @Retention(RetentionPolicy.RUNTIME)
   - Ensures the annotation remains available for reflection at runtime.
   - Necessary for getAnnotation(...) to return the annotation instance.

3. @Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
   - Defines which program elements may use this annotation.
   - Allows CricketPlayer on classes and constructors.

4. Annotation Element with Default Value
   - country() provides metadata with a pre-defined default ("India").
   - Used when no explicit value is supplied in the annotation usage.

5. Runtime Reflection (Class, getAnnotation)
   - Mechanism to inspect metadata at runtime.
   - Used to retrieve the CricketPlayer annotation applied to Viratkohili.

STRUCTURE AND ELEMENT PURPOSES
1. @interface CricketPlayer
   - Declares the annotation type.
   - Contains the element country() with default "India".

2. class Viratkohili
   - Annotated with @CricketPlayer, thus holding the default metadata value.
   - Contains a private field and simple getter/setter methods.

3. private int innigs
   - Stores the innings value for each Viratkohili object.

4. Viratkohili() constructor
   - Default constructor; annotation target allows annotation placement here if desired.

5. setInnigs(int innigs)
   - Assigns a value to the innigs field.

6. getInnigs()
   - Returns the stored innigs value.

7. public class _5_Annotation
   - Hosts the main execution sequence.

8. main method
   - Instantiates Viratkohili, sets and prints innigs, then retrieves and prints annotation metadata.

9. Variable: Viratkohili vk
   - Holds the instance whose class metadata will be inspected.

10. Variable: Class<? extends Viratkohili> c
    - Stores the Class object representing vk's runtime type.

11. Variable: CricketPlayer cp
    - Holds the annotation instance retrieved from the class object.

CONTROL FLOW (START TO END)
1. Program enters main.
2. Instantiates a Viratkohili object; no annotation values are supplied, so defaults apply.
3. Calls vk.setInnigs(44); innigs becomes 44.
4. vk.getInnigs() retrieves 44 and prints it.
5. Prints a separator line.
6. Retrieves the Class object from vk via vk.getClass().
7. Calls c.getAnnotation(CricketPlayer.class), retrieving the annotation applied to the class.
8. Accesses cp.country(), returning the default "India".
9. Prints "India".
10. Program terminates.

EXECUTION BEHAVIOR AND OUTPUT
44
----------------------------
India
*/
