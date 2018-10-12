package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Q1TwoSum {
    public static void main(String[] args){
        int[] nums = new int[]{3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target){
        //handle corner cases
        if(nums.length<2)
            return null;

        //First Solution, Sort the array and use two pivots from left and right.
        //Time complexity, sorting take nlogn, looping one round takes n, total is n+nlogn


        //Second Solution, loop once to store the array into HashMap, loop another around the find the solution
        //Time complexity, 2n
        HashMap<Integer, Integer> lib = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            lib.put(nums[i], i);
        }
        for(int j=0;j<nums.length-1; j++){
            int diff = target - nums[j];
            lib.remove(nums[j], j);
            if (lib.containsKey(diff)){
                return new int[]{j, lib.get(diff)};
            }
        }
        return null;

        //Third Solution, loop once only, loop for results while inserting into HashMap
        //Time complexity, n
    }
}
