package array_problem;
import java.util.*;

public class binary_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int ans = binarySearch(arr, target);
        System.out.println("the target element is found at index: " +  ans);
        sc.close();
    }



    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    
    




}
