package Day7;

import java.util.HashMap;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input roman numerals : ");
        String value = scanner.next();/*MMXXIII*/

        HashMap<String, Integer> romanVales = new HashMap<>();
        romanVales.put("I", 1);
        romanVales.put("V", 5);
        romanVales.put("X", 10);
        romanVales.put("L", 50);
        romanVales.put("C", 100);
        romanVales.put("D", 500);
        romanVales.put("M", 1000);

        int sum = 0, temp = 0;
        for (int i = value.length(); i > 0; i--) {
            temp = sum;
            sum += romanVales.get(value.substring(i - 1, i));
            if (i > 1) {
                switch (value.substring(i - 2, i)) {
                    case "IV":
                        sum = temp + 4;
                        i--;
                        break;
                    case "IX":
                        sum = temp + 9;
                        i--;
                        break;
                    case "XL":
                        sum = temp + 40;
                        i--;
                        break;
                    case "XC":
                        sum = temp + 90;
                        i--;
                        break;
                    case "CD":
                        sum = temp + 400;
                        i--;
                        break;
                    case "CM":
                        sum = temp + 900;
                        i--;
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}
