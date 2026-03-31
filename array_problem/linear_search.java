package array_problem;
import java.util.*;

public class linear_search {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        sc.close();
    }
    
}
