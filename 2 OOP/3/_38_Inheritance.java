class Alpha{
    int a,b;

    public Alpha(){
        a = 10;
        b = 20;
        System.out.println("Alpha zero para constructor");
    }
    public Alpha(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Para cons of Alpha");
    }
}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        this(2, 2);// first run commenting this and this
        x = 1;
        y = 2;
        System.out.println("Beta zero para constructor");
    }
    public Beta(int x,int y){
        super(4,33);
        this.x = x;
        this.y = y;
        System.out.println("Para cons of Beta");
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class _38_Inheritance {
    public static void main(String[] args) {
        Beta b = new Beta(1,2); // creating instance of child class == creating instance of parent class
        b.display();

        Beta b1 = new Beta(); // this
        b1.display(); // this
    }
    
}
