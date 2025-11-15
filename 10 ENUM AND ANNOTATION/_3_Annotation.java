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
