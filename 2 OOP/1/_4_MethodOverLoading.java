class AdditionCalc{
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    double add(int n1, double n2){
        return n1+n2;
    }
    double add(double  n1, double n2){
        return n1+n2;
    }
    double add(int n1,double n2,double n3){
        return n1+n2+n3;
    }
    double add(double  n1,double n2,double n3){
        return n1+n2+n3;
    }
}
public class _4_MethodOverLoading {
    public static void main(String[] args) {
        AdditionCalc a1 = new AdditionCalc();
        System.out.println(a1.add(4, 5));
        System.out.println(a1.add(2.2,3.2));
    }
}
/*
 * Methodoverloading refers to creating multiple methods with same name but different parameters
 * java compiler will resolve this at compile time based on number of parameters,datatype of parameters
 * and order of parameters
 * 
 * compile time polymorphism or false polymorphism
 */
// Basic naming convention:
/*
 * class name must starting with Capital letter or uppercase and if there are multiple words 
 * in class name without any space in between every word first letter must be capital
 * Ex- StudentDetail
 * 
 * Method name should be in lowercase if there are multiple words in name 
 * then first word will be small letters and second word first letter will be in capital letter so on for everynew word 
 * without space
 * 
 * variable name must be in small letter however if there are multiple names in variable and we use camle case
 * Ex- noOfWings
 */