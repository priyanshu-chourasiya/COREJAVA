public class _4_Strings {
    public static void main(String[] args) {
        final String s1 = "Alien";
        // s1 = s1 + " java"; cannot assign a value to final variable s1

        final String s2 = "Alien";
        String s3 = s2 + " java";
        System.out.println(s3);

        String s4 = "SACHIN";
        String s5 = "SACHIN";
        System.out.println(s4.compareTo(s5)); // character to character comparistion
        // 0 if equal else ascii difference of first characters which are not equal

        String s6 = "SAURAV";
        String s7 = "SEHWAG";
        System.out.println(s6.compareTo(s7));


        
    }
}
