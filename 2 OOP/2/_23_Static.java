public class _23_Static {

    static int a;
    static {
        a = 10;
        System.out.println(a);
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
