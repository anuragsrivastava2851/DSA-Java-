package array_problem;
public class Kadanes_Algorithm {
// maximum subarray sum using Kadane's algorithm

    public static int kadanes_alogorithm(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {1, -2, 3, 4, -5, 6,12,-4,8};
        int maxSum = kadanes_alogorithm(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
    
}
