package Queue;
import java.util.*;
// interleave 2 halves of queue  
/* example:- 
 * Input: 1 2 3 4 5 6
 * Output: 1 4 2 5 3 6
 */

public class interLeave_2halvesQueue {

    public static void interLeaveQueue(Queue<Integer> q){

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }


        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

   }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }


        interLeaveQueue(q);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove(); 
        }
    

    }    


    
}
