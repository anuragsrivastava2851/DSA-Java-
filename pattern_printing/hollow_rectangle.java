package pattern_printing;

public class hollow_rectangle {
    public static void printHollowRectangle(int rows, int cols) {
        for(int line=1;line<=rows;line++){
            for(int col=1;col<=cols;col++){
                if(line==1 || line==rows || col==1 || col==cols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;
        printHollowRectangle(rows, cols);
       
        }
    }

