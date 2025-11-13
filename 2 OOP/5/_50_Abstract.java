abstract class Animal{
    public Animal(){
        System.out.println("Aeroplane constructor");
    }
    public abstract void eat();
    public void run(){
        System.out.println("Animal is running");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger is eating");
    }
    public void run(){
        System.out.println("Tiger is running");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is eating");
    }
    public void run(){
        System.out.println("Monkey is running");
    }
}
class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.run();
    }
}
public class _50_Abstract {
    public static void main(String[] args) {
        // Animal a = new Animal(); // we cannot create object/instance of abstract
        Tiger t = new Tiger();

        Monkey m = new Monkey();

        Forest f = new Forest();
        f.permit(m);
        f.permit(t);
    }
}
/*
 * if a child class is inheriting a abstract class and that child class also dont
 * give implementation then that child class has to be astract also
 * 
 * 
 * 
 * In java we can have methods without body/implementation with only signature 
 * however such methods such method must be declared using abstract keyword
 * (abstract methods are such methods which does not have body or implementation)
 * if one method is also decalred as abstract in a class then the class also
 * must be decalred abstract
 * abstract class can have all methods as abstract
 * abstract class can have few methods abstract few methods concrete(method with body)
 * (however if one method is also abstract class also must be abstract)
 * we cannot create object/instance of abstract class
 * however we can create reference of abstract class to acheive polymorphism
 * abstract class will have constructor however this will be executed because of 
 * super method call present in child classes
 * we cannot make constructor as abstrac -> it is illegal 
 * we can declare class as abstarct, method as abstract we cannot a variable as abstract
 * 
 * we caanot make abstarct class/method final 
 * 
 * because final class dont participate in inheritance and abstract class must participate in inheritance 
 * because abstract method must get overridden in child classes and final methods we cannot override
 */
