class Plane1{
    final public void fly(){
        System.out.println("Plane 1 is flying");
    }
}
class FighterPlane extends Plane1{
    
}
public class _44_Inheritance {
    public static void main(String[] args) {
        FighterPlane fp = new FighterPlane();
        fp.fly();
    }
    
}
// final keyword can be applied to a method
// final methods do participate in inheritance
