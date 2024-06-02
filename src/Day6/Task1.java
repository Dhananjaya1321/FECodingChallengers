package Day6;

public class Task1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] tempArr=new int[arr.length];

        int count=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            tempArr[count++]=arr[i];
        }

        for (int i : tempArr){
            System.out.print(i+", ");
        }
        System.out.println("\b\b");
    }
}
