package Day5;

public class Task4 {
    public static void main(String[] args) {
        label:
        for (int i = 1; i < 101; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    if (i==j) {
                        System.out.print(i+", ");
                    }else {
                       continue label;
                    }
                }
            }
        }
        System.out.println("\b\b");
    }
}
