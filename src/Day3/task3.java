package Day3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year : ");
        int year= scanner.nextInt();

        if (year%4==0){
            if (year%100!=0 || year%400==0){
                System.out.println("Leap year");
            }else {
                System.out.println("Is not a leap year");
            }
        }else {
            System.out.println("Is not a leap year");
        }
    }
}
