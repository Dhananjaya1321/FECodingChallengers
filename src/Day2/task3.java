package Day2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.next().charAt(0);

        if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' ||
                value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }

    }
}
