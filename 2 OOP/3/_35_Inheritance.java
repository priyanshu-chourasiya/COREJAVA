class AeroPlane{
    void fly(){
        System.out.println("Aeroplace is flying");
    }
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane extends AeroPlane{
    void fly(){
        System.out.println("Cargo plane is flying");
    }
    void takeOff(){
        System.out.println("Cargo is taking off");
    }
}
class PassangerPlane extends CargoPlane{

}
public class _35_Inheritance {
    public static void main(String[] args) {
        // CargoPlane cp = new CargoPlane();
        // cp.fly();
        // cp.landing();
        

        AeroPlane pp = new PassangerPlane(); // upcasting creating parent type reference for child object
        // refrence variable (same type or parent type)
        pp.fly();
        pp.landing();
        // only in one case the reference varible can be of different type 
        // only of its parent type
        //pp.takeOff();

        ((CargoPlane) pp).takeOff(); // downcasting : temporarly changing parent type reference to child type
        // so that we can access specialized methods in child class
        // way to access specialized behaviour


    }   
}