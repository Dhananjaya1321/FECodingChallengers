package Day5;

public class Task3{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i]=arr2[i];
        }

        for (int i : arr3){
            System.out.print(i+", ");
        }
        System.out.println("\b\b");
    }
}
