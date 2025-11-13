class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
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
public class _49_Polymorphism {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        Monkey m = new Monkey();

        Forest f = new Forest();

        f.permit(m);
        f.permit(t);
    }
}
