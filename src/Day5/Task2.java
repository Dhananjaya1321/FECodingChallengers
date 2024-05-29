package Day5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input value : ");
        int value = scanner.nextInt();
        int[] arr = {5, 80, 64, 3, 8, 852, 9, 9, 50, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (value==arr[i]) {
                System.out.println(i);break;
            }
        }

    }
}
