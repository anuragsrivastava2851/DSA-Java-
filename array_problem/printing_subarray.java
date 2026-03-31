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
            for(int j=i; j<arry.length; j++){
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
