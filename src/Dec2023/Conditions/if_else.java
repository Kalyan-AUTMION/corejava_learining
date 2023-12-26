package src.Dec2023.Conditions;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();

        if (num > 20){
            System.out.println("your number is greater than 20");
        }else if (num<10){
            System.out.println("your number  is greater tha 10");
        }else{
            System.out.println("your num is lessthan 20");
        }

         */

        //WAP that calculates and displayes the letter grade for a giver numerical score(eg A,B,C,D,F) based on following grading scale
          /*A
          B
          C
          D
          E
          F*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter score");
        int score =sc.nextInt();

        if (score >=90 && score <=100 ){
            System.out.println("your grade is A");
        } else if (score >=80 && score <=89) {
            System.out.println("your grade is B");
        }else if (score >=70 && score <=79) {
            System.out.println("your grade is c");
        }else if (score >=60 && score <=69) {
            System.out.println("your grade is D");
        }else {
            System.out.println("you are failed");
        }


    }
}
