// print numbers from n to 1 in decreasing order using recursion

package recursion;
import java.util.*;

public class problem_2 {
    public static void printNumbers(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumbers(n-1);
    }  
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }
}
