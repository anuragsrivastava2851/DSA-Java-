package array_list;
import java.util.ArrayList;

// find any pair sum in a sorted array list has target sum or not...

public class pair_sum1 {
    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target= 9;

        System.out.println(pairSum(list, target));
    }
// Brute force approach O(n^2)

    public static boolean pairSum(ArrayList<Integer> list, int target){

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) +list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }


    
}
