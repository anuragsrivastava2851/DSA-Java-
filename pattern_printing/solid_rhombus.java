package pattern_printing;

public class solid_rhombus {
    public static void printSolidRhombus(int n) {
        for(int row=1;row<=n;row++){
            for(int j=1;j<=n-row;j++){               // space
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){        // *  
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n = 5;
        printSolidRhombus(n);
       
        }
}
