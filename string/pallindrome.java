package string;
import java.util.*;

public class pallindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str= sc.nextLine();

        if(isPallindrome(str)){
            System.out.println("The string is a pallindrome.");
        } else {
            System.out.println("The string is not a pallindrome.");
        }
        sc.close();
    }


    public static boolean isPallindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
            
      
    }
    
    
}
