class Patterns {
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        pattern8(5);
    }
    static void pattern1(int n){
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        n = n - 1;
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            int noofspaces = n - i;
            for(int j = 1; j <= noofspaces;j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i = 1 ; i <= n; i++){
            int noofspaces = i - 1;
            for(int j = 1 ; j<= noofspaces;j++){
                System.out.print(" ");
            }
            for(int j = n ; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
// Pattern Questions

// Print these patterns using loops:

// ```text

// 1.  *****
//     *****
//     *****
//     *****
//     *****


// 2.  *
//     **
//     ***
//     ****
//     *****


// 3.  *****
//     ****
//     ***
//     **
//     *


// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5


// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *


// 6.       *
//         **
//        ***
//       ****
//      *****


// 7.   *****
//       ****
//        ***
//         **
//          *


// 8.      *
//        ***
//       *****
//      *******
//     *********


// 9.  *********
//      *******
//       *****
//        ***
//         *


// 10.      *
//         * *
//        * * *
//       * * * *
//      * * * * *


// 11.  * * * * *
//       * * * *
//        * * *
//         * *
//          *


// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *


// 13.      *
//         * *
//        *   *
//       *     *
//      *********


// 14.  *********
//       *     *
//        *   *
//         * *
//          *


// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *


// 16.           1
//             1   1
//           1   2   1
//         1   3   3   1
//       1   4   6   4   1


// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1


// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********


// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *


// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

// 29.      
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5


// 31.      4 4 4 4 4 4 4  
//          4 3 3 3 3 3 4   
//          4 3 2 2 2 3 4   
//          4 3 2 1 2 3 4   
//          4 3 2 2 2 3 4   
//          4 3 3 3 3 3 4   
//          4 4 4 4 4 4 4   

// 32.    E
//        D E
//        C D E
//        B C D E
//        A B C D E

// 33.    a
//        B c
//        D e F
//        g H i J
//        k L m N o
     
// 34.    E D C B A
//        D C B A
//        C B A
//        B A
//        A
       
// 35.    1      1
//        12    21
//        123  321
//        12344321
// ```
