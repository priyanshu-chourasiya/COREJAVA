public class _5_Strings {
    public static void main(String[] args) {
        String s1= "Raj aRam Mohan Roy";
        String[] str = s1.split(" ");
        System.out.println(str.length);
        for(String i : str){
            System.out.print(i);
        }
        System.out.println();

        String s2 = "   Raja Ram Mohan Roy  ";
        System.out.println(s2);
        System.out.println(s2.trim()); // leading and trailing space (removes)
        System.out.println(s2.stripTrailing()); // removes last spaces
        System.out.println(s2.stripLeading());
    }
}
