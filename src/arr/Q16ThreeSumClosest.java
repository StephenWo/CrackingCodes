package arr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q16ThreeSumClosest {
    public static void main(String[] args){
        int[] nums = new int[]{-1, 2, 1, -4};
        System.out.println("Closest sum is " + threeSumClosest(nums,1));
    }

    private static int threeSumClosest(int[] nums, int target) {
        /*Solution
        * Setup three pointers, i,j,k where i stands for left, k is right, i<j<k
        * loop through by setting i stable, shift j & k
        * T = O(n^2)
        * This method beats 50%
        *
        * Improve: Rm dups, not done in this code
        * */

        if(nums.length<3)
            return 0;

        Arrays.sort(nums);

        int k = nums.length - 1;
        int j;
        int curSum = 0 ;
        int targetSum = nums[0] + nums[1] + nums[2];


        for (int i = 0; i < nums.length - 2; i++){
            j = i + 1;
            k = nums.length - 1;
            while (j<k){
                curSum = nums[i] + nums[j] + nums[k];

                if (curSum == target)
                    return target;

                targetSum = (Math.abs(target - targetSum) > Math.abs(target - curSum)) ?  curSum : targetSum;

                if(curSum > target){
                    k --;
                }else{
                    j++;
                }


            }


        }

        return targetSum;
    }


}
