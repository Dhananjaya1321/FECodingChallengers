package Day2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for x :");
        int x= scanner.nextInt();

        System.out.print("Enter value for y :");
        int y= scanner.nextInt();

        x = x + y;//x--->30
        y = x - y;//y--->30-20==10
        x = x - y;//x--->30-10=20
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
