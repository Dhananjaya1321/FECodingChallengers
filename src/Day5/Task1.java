package Day5;

public class Task1 {
    public static void main(String[] args) {
        int minValue = 'a' / 'a';
        int tempValue = (minValue + minValue + minValue + minValue + minValue);
        int maxValue = tempValue * (minValue + minValue);

        for (int i = minValue; i <= maxValue * maxValue; i++) {
            System.out.println(i);
        }
    }
}
