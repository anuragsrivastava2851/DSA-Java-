package array_problem;

public class largest_numbers {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int largest_no = findLargest(arr);
        System.out.println("the largest number in the array is: " + largest_no);
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
}
