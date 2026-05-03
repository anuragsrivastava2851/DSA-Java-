// print binary strings of length n using recursion


package recursion;
import java.util.*;

public class problem_6 {
    public static void binaryStrings(int n, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryStrings(n-1, str + "0");
        binaryStrings(n-1, str + "1");

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of binary strings: ");
        int n = sc.nextInt();
        binaryStrings(n, "");
        sc.close();
    }

    
}
