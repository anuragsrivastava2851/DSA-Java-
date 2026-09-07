package array_list;

import java.util.ArrayList;

public class maximum_InList {
       public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.add(7);
       list.add(4);
       list.add(5);

       System.out.println(list);
       findMax(list);
       System.out.println(findMax(list));

    }

    public static int findMax(ArrayList<Integer> list){
        int max= Integer.MIN_VALUE;
        for(int i =0; i<list.size(); i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;

    }


    
}
