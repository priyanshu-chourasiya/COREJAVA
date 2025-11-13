class Alien{
    static {
        System.out.println("static 1");
    }
    static {
        System.out.println("static 2");
    }
    {
        System.out.println("instance 1");
    }
    {
        System.out.println("instance 2");
    }
}
public class _27_Static {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        
        Alien a2 = new Alien();

    }
}
