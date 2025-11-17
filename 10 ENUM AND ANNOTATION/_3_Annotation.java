class Animal{
    public void animalUsuallyHuntsAndEat(){
        System.out.println("Animal is eating");
    }
}
class Tiger extends Animal{
    // Overriding parent class method to suit child requirement 
    // but no reaching the compiler or JVM
    // comments are only till developer level
    @Override
    public void animalUsuallyHuntsAndEat(){
        System.out.println("Tiger is eating");
    }
}
public class _3_Annotation {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.animalUsuallyHuntsAndEat();
    }
}
/*
PROGRAM SUMMARY
The program demonstrates method overriding using a subclass (Tiger) that replaces a superclass behavior (Animal). It uses the @Override annotation to ensure correctness of the overridden method and executes the overridden behavior at runtime.

IMPORTANT CONCEPTS IN THIS CODE
1. Inheritance (Animal → Tiger)
   - A relationship where a subclass acquires accessible behavior from its superclass.
   - Used here so Tiger inherits the method animalUsuallyHuntsAndEat from Animal.

2. Method Overriding
   - A subclass redefining a method with the same signature as in its superclass.
   - Tiger redefines the inherited method to provide species-specific behavior.

3. @Override Annotation
   - A compiler-level instruction stating that a method must override an inherited one.
   - Ensures Tiger’s method matches an existing superclass method exactly.

STRUCTURE AND ELEMENT PURPOSES
1. class Animal
   - Defines a general behavior for animals via animalUsuallyHuntsAndEat.

2. animalUsuallyHuntsAndEat in Animal
   - Prints “Animal is eating”.
   - Serves as the base version of the method intended for overriding.

3. class Tiger extends Animal
   - Specializes Animal by providing species-specific behavior.

4. Overridden animalUsuallyHuntsAndEat in Tiger
   - Replaces the inherited behavior.
   - Prints “Tiger is eating”.

5. public class _3_Annotation
   - Contains the program entry point.

6. main method
   - Creates a Tiger instance and triggers the overridden method.

7. Variable: Tiger t
   - Holds a Tiger object and is used to invoke the method demonstrating overriding.

CONTROL FLOW (START TO END)
1. Program enters main.
2. Instantiates Tiger and assigns it to t.
3. Calls t.animalUsuallyHuntsAndEat().
4. JVM dispatches the overridden Tiger version at runtime.
5. Prints the Tiger-specific output.
6. Program ends.

EXECUTION BEHAVIOR AND OUTPUT
Tiger is eating
*/
