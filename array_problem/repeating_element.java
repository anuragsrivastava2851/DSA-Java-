package array_problem;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct */

public class repeating_element {
    public static boolean containsDuplicate(int[] nums){
        for(int i =0; i <nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] nums1  = {1, 2, 3, 1};
        int[] nums2  = {1, 2, 3, 4};
        int[] nums3  = {1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean ans1 = containsDuplicate(nums1);
        boolean ans2 = containsDuplicate(nums2);
        boolean ans3 = containsDuplicate(nums3);

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    
}
