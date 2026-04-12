import java.util.*;
public class decimal_toBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        decimalToBinary(decimal);
        sc.close();
    }

    public static void decimalToBinary(int decimal) {
       int power = 0;
       int binary = 0;
       while (decimal>0) {
        int remainder = decimal % 2;
        binary += remainder * Math.pow(10, power);
        power++;
        decimal /= 2;
       }
       System.out.println("Binary equivalent: " + binary);
    }
}
