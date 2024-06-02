package Day6;

public class Task2 {
    public static void main(String[] args) {
        int[] arr={80,5,30,77,0,1};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        for (int a : arr){
            System.out.print(a+",");
        }
        System.out.println("\b");

        System.out.println("second largest element in an array : "+arr[arr.length-2]);
        System.out.println("second smallest element in an array : "+arr[1]);
    }
}
