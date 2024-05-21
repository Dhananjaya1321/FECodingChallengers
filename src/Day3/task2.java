package Day3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int value= scanner.nextInt();

        int factorial=1;
        System.out.print(value+"! = ");
        for (int i = 1; i <= value; i++) {
            factorial*=i;
            System.out.print(i+" * ");
        }
        System.out.println("\b\b= "+factorial);
    }
}
