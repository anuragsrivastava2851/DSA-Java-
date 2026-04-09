package string;

public class lexicographic_order {
    public static void main(String[] args){
    String[] arr = {"apple", "banana", "grape", "orange", "kiwi"};
    String largest = arr[0];
     for (int i=1; i<arr.length; i++){
        if (arr[i].compareTo(largest) > 0){
            largest = arr[i];
        }
     }
// largest string means string which comes last in lexicographic order
    System.out.println("Largest string in lexicographic order: " + largest);

}
}
