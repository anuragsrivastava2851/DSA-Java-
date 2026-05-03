// print the numbers from 1 to n in increasing order using recursion
package recursion;
import java.util.*; 


public class problem_1 {
    public static void printNumbers(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }

}