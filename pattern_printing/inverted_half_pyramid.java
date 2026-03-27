package pattern_printing;

public class inverted_half_pyramid {

    public static void printInvertedHalfPyramid(int rows) {
        for(int line=1 ; line<=rows ; line++) {

        // for spaces
            for(int j=1 ; j<=rows-line ; j++) {
                System.out.print(" ");
            }
        // for stars    
            for(int k=1 ; k<=line ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 5;
        printInvertedHalfPyramid(rows);
    }
}
