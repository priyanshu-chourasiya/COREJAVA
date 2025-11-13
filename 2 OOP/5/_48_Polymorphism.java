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
class Airport{
    public void permit(Aeroplane ap){
        ap.takingOff();
        ap.fly();
        ap.landing();
    }
}
public class _48_Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        FighterPlane fp = new FighterPlane();
        
        PassangerPlane pp = new PassangerPlane();
        
        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);
    }
}
 
