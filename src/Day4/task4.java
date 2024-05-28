package Day4;

public class task4 {
    public static void main(String[] args) {
        int[] arr={5,80,64,3,8,852,9,9,50,0,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println(sum);

        /*======================================== average ===================================== */
        System.out.println("\n"+((double)sum/arr.length));
    }
}
