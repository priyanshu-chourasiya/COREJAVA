class AeroPlane{
    void fly(){
        System.out.println("Aeroplace is flying");
    }
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane extends AeroPlane{

}
class PassangerPlane extends CargoPlane{

}
public class _31_Inheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.landing();
        

        PassangerPlane pp = new PassangerPlane();
        pp.fly();
        pp.landing();



    }   
}
/*
 * inheritance refers to the process of acquiring properties and behaviour(methods) of another class
 * it is also refers to writing code hierarchy of class rather than a class
 * 
 * inheritance can be acheived using extends keyword
 * 
 * Inheritance promotes is-a relationship
 * 
 * a class which requires properties and behaviours(methods) of another class is refered as child class
 * or derived class or sub class
 * 
 * class which is acquiring is called parent class or base class or super class
 * 
 * a class can have many child classes 
 * one parent class can have multiple child classes
 * 
 * default nautre of java that most upper class which dont extents any class extends a class Object
 * Object class is parent of all classes
 * 
 * multiple inheritance is not allowed in java i.e., a class cannot extends multiple classes or
 * one child class cannot have multiple parent classes as it will lead to ambiguity and diamond shape problem
 */