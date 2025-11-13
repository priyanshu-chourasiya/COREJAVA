
public class _2_Strings {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);
        s1.concat(" alien"); 
        System.out.println(s1);
        String s2 = s1.concat(" alien");
        System.out.println(s2);


        System.out.println("----------------------");

        String s3 = "alien  ";
        String s4 = s3.concat(" java");
        String s5 = s3 + s4;
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("----------------------");

        String s = "Spring" + 12 + 221; // Spring12221
        // to a string anything we concatinate it will become string
        System.out.println(s);

        String s6 = 43 + 212 + " Spring";
        System.out.println(s6);
    }
}
