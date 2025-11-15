class Gama{
    public int display(){
        try{
            System.out.println("Display method of alpha");
            return 10;
        }
        finally{
            System.out.println("Finally of gama"); // both will get executed
            return 99;
        }
    }
}
public class _9_Exception {
    public static void main(String[] args) {
        Gama g = new Gama();
        //g.display();
        System.out.println(g.display());
    }
}
//
