package array_problem;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reversed array:");
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        for (int num=0; num < arr.length; num++) {
            System.out.print(arr[num] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arry){
        int start=0;
        int end=arry.length-1;
        while(start<end){
            int temp=arry[start];
            arry[start]=arry[end];
            arry[end]=temp;
            start++;
            end--;
        }
    }
}
