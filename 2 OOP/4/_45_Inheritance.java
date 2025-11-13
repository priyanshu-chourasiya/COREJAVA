class Plane1{
    final int age = 10; // final keyword can be assigned to a variable
    final public void fly(){
        age = 90; // cannot assign value to a final variable (cannot be reasigned)
        System.out.println("Plane 1 is flying");
    }
}
class FighterPlane extends Plane1{
    // public void fly(){ // we cannot override final method
    //     System.out.println("Plane 1 is flying");
    // }
}
public class _45_Inheritance {
    public static void main(String[] args) {
        FighterPlane fp = new FighterPlane();
        fp.fly();
    }
    
}
// final can be applied to static variable , static method, cannot to constructor