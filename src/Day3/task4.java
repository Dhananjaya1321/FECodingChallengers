package Day3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int value= scanner.nextInt();

        int reversValue=0,temp=value;
        while (value!=0){
            int i = value % 10;
            value = value / 10;
            reversValue=reversValue*10+i;
        }

        if (temp==reversValue){
            System.out.println("palindrome number");
        }else {
            System.out.println("is not a palindrome number");
        }

    }
}
