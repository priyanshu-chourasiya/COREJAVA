
public class _1_Strings {
    public static void main(String[] args) {
        // "a" - string
        // 'a' - character
        String s1 = "abc";
        String s2 = new String("abc"); // immutable
        System.out.println("1 : " + " " +  s1 == s2); // references of a string
        System.out.println("2 : " + s1.equals(s2)); // actual data 

        String s3 = "priyanshu";
        String s4 = "priyanshu";
        System.out.println("3 : " + s3 == s4);
        System.out.println("4 : " + s3.equals(s4));

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(s5 == s6); 
        System.out.println(s5.equals(s6));

        String s7 = "Abc";
        String s8 = "abc";
        System.out.println(s7 == s8);
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
    }
}
// java is case sensitive language // 