package src.Dec2023.Conditions;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1-7 , i will tell the day");
        int dayNum = sc.nextInt();

        switch(dayNum){
            default:
                System.out.println("you are mad");
                case1:
            System.out.println("Mon");
            break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sat");
                break;

        }
     }
}

