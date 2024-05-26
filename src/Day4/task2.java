package Day4;

public class task2 {
    public static void main(String[] args) {
        int[] arr={5,80,64,3,8,852,9,9,50,0,1};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
