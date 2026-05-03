// check if given array is sorted or not using recursion

package recursion;

public class problem_5 {
    public static boolean isSorted( int arr[], int i){
        if(i==arr.length-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);

    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 6, 4, 5};
        boolean ans = isSorted(arr, 0);
        if(ans){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
    
}
