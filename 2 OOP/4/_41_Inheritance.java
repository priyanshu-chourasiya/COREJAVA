
public class Plane{

}
class FighterPlane extends Plane{

}
class Animal{
    public void eat(String name){
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
    public void eat(String name){ // this is overloaded 
        System.out.println("Animals are eating");
    }
    public void eat(){ // this is specialized
        System.out.println("Animals are eating");
    }
    protected void sleep(){ 
        System.out.println("Tiger is sleeping");
    }

    public FighterPlane run(){ // co varient return type (where is-a relationship)
        System.out.println("Tiger is running");
        FighterPlane fp = new FighterPlane();
        return fp;
    }
}
public class _41_Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
    
}

