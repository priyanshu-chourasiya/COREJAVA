public class _7_Method {
    public static void main(String[] args) {
        System.out.println("Main method with string args[]");
        main(44);
        main("Rohan",4);
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
    // we can override main method but jvm will envoke main method with String[] args
}
