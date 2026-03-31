package array_problem;

public class printing_subarray {
    public static void main(String[] args) {
        int[] arry = {1,56,6,34,78,97,23,46,43,44,33,5,26};
        System.out.println("subarrays of the given array are:");
        print_subarrays(arry);
    }
    

    public static void print_subarrays(int[] arry){
        for(int i =0; i<arry.length; i++){
            int start=i;
            for(int j=i; j<arry.length; j++){    // j=i+1 also use when we want to print subarray of size 2 or more than 2 but when we want to print all the subarrays then we use j=i because it also include the subarray of size 1 which is also a valid subarray.....
                int end=j;
                for(int k=start; k<=end; k++){            // array ke element ko print karne ke liye loop subarray form me.....

                    System.out.print(arry[k] + " ");  
                }
                System.out.println(); // Print a new line after each subarray

            }
            System.out.println(); // Print a new line after each starting index

        }
    }
}
