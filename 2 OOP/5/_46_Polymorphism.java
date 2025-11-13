class Aeroplane{
    public void takingOff(){
        System.out.println("Plane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Plane is landing");
    }
}
class CargoPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("CargoPlane must take off in order to fly");
    }

    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class FighterPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("FighterPlane must take off in order to fly");
    }

    public void fly(){
        System.out.println("Fighterplane is flying");
    }
}
public class _46_Polymorphism {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane(); // creating parent class referce for child class object
        cp.takingOff();
        cp.landing();
        //cp.fly(); error
        ((CargoPlane) cp).fly();


        Aeroplane fp = new FighterPlane();
        fp.takingOff();
        fp.landing();
    }
}
