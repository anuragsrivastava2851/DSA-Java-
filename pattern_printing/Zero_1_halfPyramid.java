package pattern_printing;

public class Zero_1_halfPyramid {
    public static void printZeroOneHalfPyramid(int n) {
        for(int row=1;row<=n;row++){
            for(int j=1;j<=row;j++){
                if((row+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n = 5;
        printZeroOneHalfPyramid(n);
       
        }
    
}
