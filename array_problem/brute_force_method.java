package array_problem;
// maximum subarray sum using brute force method
public class brute_force_method {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 4, -5, 6,12,-4,8};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                //  OR :- maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    
}
