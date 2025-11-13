public class _6_Strings {
    public static void main(String[] args) {
        // mutable string : 
        // StringBuffer StringBuilder

        // StringBuffer s = "ABC"; not allowed

        StringBuffer s1 = new StringBuffer("Telusko");
        System.out.println(s1);
        s1.append("AA");
        System.out.println(s1);
        s1.append(true);
        System.out.println(s1.getClass().getName());
        System.out.println(s1);

        System.out.println("--------");

        StringBuilder s2 = new StringBuilder("Telusko");
        System.out.println(s2);
        s2.append("AA");
        System.out.println(s2);
        s2.append(true);
        System.out.println(s2.getClass().getName());
        System.out.println(s2);
    }
}
