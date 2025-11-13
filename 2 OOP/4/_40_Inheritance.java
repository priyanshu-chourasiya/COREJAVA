class Plane{

}
class FighterPlane extends Plane{

}
class Animal{
    public void eat(){
        System.out.println("Animals are eating");
    }
    void sleep(){
        System.out.println("Animals are sleeping");
    }
    public Plane run(){
        System.out.println("Animal is running");
        Plane p = new Plane();
        return p;
    } 
}
class Tiger extends Animal{
    // void eat(){ error cannot reduce visibility (public -> default)
    //     System.out.println("Tiger hunts and eats");
    // }
    protected void sleep(){ // we can increase visibility of overridden methods
        System.out.println("Tiger is sleeping");
    }

    // public int run(){ // the primitive return type cannot be changed
    //     System.out.println("Tiger is running to hunt");
    //     return 20;
    // }
    public FighterPlane run(){ // co varient return type (where is-a relationship)
        System.out.println("Tiger is running");
        FighterPlane fp = new FighterPlane();
        return fp;
    }
}
public class _40_Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
    
}
