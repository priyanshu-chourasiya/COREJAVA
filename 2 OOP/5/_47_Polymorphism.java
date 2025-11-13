class Aeroplane{
    public void takingOff(){
        System.out.println("Plane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Plane is landing");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("CargoPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Cargolane is landing");
    }
    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class PassangerPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("PassangerPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("PassangerPlane is landing");
    }
    public void fly(){
        System.out.println("PassangerPlane is flying");
    }
}
class FighterPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("FighterPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Fighterplane is landing");
    }
    public void fly(){
        System.out.println("Fighterplane is flying");
    }
}
public class _47_Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        FighterPlane fp = new FighterPlane();
        // int a = 10;
        // long b;
        // b = a;
        Aeroplane ref;
        ref = cp;
        ref.takingOff();
        ref.fly();
        ref.landing();
        System.out.println("______________________");
        ref = fp;   // 1:M  
        ref.takingOff();
        ref.fly();
        ref.landing();
        System.out.println("______________________");

        PassangerPlane pp = new PassangerPlane();
        ref = pp;
        ref.takingOff();
        ref.fly();
        ref.landing();
    }
}
