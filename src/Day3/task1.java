package Day3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number : ");
        int value = scanner.nextInt();

        if (value == 0) {
            System.out.println("Zero");
        } else if (value > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
