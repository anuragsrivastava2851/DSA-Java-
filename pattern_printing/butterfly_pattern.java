package pattern_printing;

public class butterfly_pattern {
    public static void printButterflyPattern(int n) {

// 1st half

        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){       // *
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-row);j++){ // space
                System.out.print("  ");    
            }
            for(int j=1;j<=row;j++){      // *
                System.out.print("* ");
            }

            System.out.println();

        }


// 2nd half
        for(int row=n;row>=1;row--){
            for(int j=1;j<=row;j++){       // *
                System.out.print("* ");
            }
            for(int j=1;j<=2*(n-row);j++){ // space
                System.out.print("  ");    
            }
            for(int j=1;j<=row;j++){      // *
                System.out.print("* ");
            }

            System.out.println();

        }

    }
    public static void main(String[] args) {
        int n = 5;
        printButterflyPattern(n);
       
        }
}
