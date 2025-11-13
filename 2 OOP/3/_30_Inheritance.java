class Telusko{
    int age;
    void display(){
        age = 10;
        System.out.println("Priyanshu is " + age + " years old!");
    }
}
class Alien extends Telusko{

}
public class _30_Inheritance {
    public static void main(String[] args) {
        // Telusko t = new Telusko();
        // t.display();

        Alien a = new Alien();
        a.display();

    }
    
}
