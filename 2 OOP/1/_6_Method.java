public class _6_Method {
    public static void main(String[] args) {
        System.out.println("Main method with string args[]");
    }
    public static void main(int[] args) {
        System.out.println("Main method with int[] args");
    }
    public static void main(int args) {
        System.out.println("Main method with int args");
    }
    public static void main(String name, int age) {
        System.out.println("String name int age");
    }
    // we can override main method but jvm with envoke main method with String[] args
}
