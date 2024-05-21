package Day2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value : ");
        int value = scanner.nextInt();

//        if (value % 2 == 0) {
//            System.out.println("Even Value");
//        }else {
//            System.out.println("Odd value");
//        }
        System.out.println((value % 2 == 0) ? "Even Value" : "Odd value");

    }
}
