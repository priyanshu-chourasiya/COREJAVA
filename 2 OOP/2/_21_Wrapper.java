public class _21_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a : " + a);
        Integer i = new Integer(10);
        // - line means if u write this no problem but dont do this
        System.out.println("i : " +  i);

        Integer j = Integer.valueOf(10); // with class name i am calling method
        System.out.println("j : " + j);

        int n1 = 10;    // Boxing
        Integer n2 = n1; // primitive data type to its corresponding wrapper class // Autoboxing : automatic boxing
        
        Integer x = Integer.valueOf(10);
        // Unboxing
        // wrapper to corresponding data type
        // autounboxing

        Integer n3 = Interger.valueOf(99);
        int n4 = n3;

        // manually
        int n5 = n3.intValue();


    }
}
