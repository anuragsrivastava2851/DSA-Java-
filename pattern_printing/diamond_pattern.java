package pattern_printing;

public class diamond_pattern {
    public static void printDiamondPattern(int n) {
        // 1st half
        for(int row=1;row<=n;row++){
            for(int j=1;j<=n-row;j++){               // space
                System.out.print("  ");
            }
            for(int j=1;j<=2*row-1;j++){        // *  
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for(int row=n;row>=1;row--){
            for(int j=1;j<=n-row;j++){               // space
                System.out.print("  ");
            }
            for(int j=1;j<=2*row-1;j++){        // *  
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n = 5;
        printDiamondPattern(n);
       
        }   
}
