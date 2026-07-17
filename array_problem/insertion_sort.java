package array_problem;
// import java.util.*;

public class insertion_sort{
    public static void main(String args[]){
        int arr[] = {5, 2, 9, 1, 5, 6};
        insertionSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void insertionSort(int arr[]){
        
        for(int i=1 ; i<arr.length ; i++){   // this loop is used to find the perfect position for the current element
            int current= i;
            int prev = i-1;
            while(prev>=0 && arr[prev]>arr[current]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[current];  // it is used to place the current element in its correct position
        }

    }
}