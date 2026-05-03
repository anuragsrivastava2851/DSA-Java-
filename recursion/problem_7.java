/* given 2*n board and tiles of size 2*1, count the number
   of ways to tile the board using the tiles
   (a tile can either be placed horizontally or vertically)
 */     


package recursion;
import java.util.*;

public class problem_7 {
    public static int tiling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = tiling_problem(n-1);
        int fnm2 = tiling_problem(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = tiling_problem(n);
        System.out.println("the number of ways to tile the board is: " + ans);
        sc.close();
    }
    
}
