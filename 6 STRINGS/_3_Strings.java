
public class _3_Strings {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
        //str = str.toUpperCase();
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(4,12));
        System.out.println(str.substring(4));
        char ch[] = str.toCharArray();
        for(char i : ch){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(str.toCharArray());
        System.out.println(str.charAt(4));
        System.out.println(str.contains("Mohan"));
        System.out.println(str.startsWith("Raj"));
        System.out.println(str.endsWith("y"));
        System.out.println(str.indexOf("a")); // first index
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf("a"));
    }
}
