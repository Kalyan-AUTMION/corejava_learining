package src.Dec2023;

import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {



    //Typecasting: Refers to the process of converting a variable from one data type to another.
    /*
    1.IMPLICIT CASTING:
    Implicit casting happens automatically when a smaller data type is assigned to a larger data type.

    2.EXPLICIT CASTING
    Explicit casting must be done manually when a larger data type is assigned to a smaller data type.
     */


//    byte b = 10;
//    int a = 10;   //implicit casting
//         System.out.println(a);
//
//         int a1= (int)b;
//        System.out.println(a1); //Explicit castinhg


//        int a= 100;
//        long b=a;
//        System.out.println(b); // implicit
//
//        int a1=200;
//        long b1= (long)a1;
//        System.out.println(b1); //explicit


//SCANNER CLASS:
        Scanner  sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();

        if (x>y){
            System.out.println("x value is larger");
        }else {
            System.out.println("y value is larger");
        }






}


}
