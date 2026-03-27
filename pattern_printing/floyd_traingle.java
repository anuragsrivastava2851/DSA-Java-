package pattern_printing;

public class floyd_traingle {
    public static void printFloydTraingle(int n) {
        int number = 1;
        for(int line=1;line<=n;line++){
            for(int j=1;j<=line;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        int n = 5;
        printFloydTraingle(n);
       
        }
}
