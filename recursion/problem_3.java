// factorial of a number using recursion

package recursion;
import java.util.*;

public class problem_3 {
    public static int factorial(int n){
        if(n==0){
            return 1;

        }
        int fnm1= factorial(n-1);
        int fn = n*fnm1;
        return fn;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("the factorial of " + n + " is: " + ans);
        sc.close();
    }
    
}
