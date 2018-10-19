package Array;

public class Q53MaxSubarray {
    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        //loop through the array, record cur sum, if >0 keep adding, if not, stop
        if(nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int high_sum = nums[0];
        int cur_sum = nums[0];

        for (int i =1; i<nums.length; i++){
            if (cur_sum < 0){
                cur_sum = Math.max(cur_sum, nums[i]);
            }else {
                cur_sum+=nums[i];
            }

            high_sum = Math.max(cur_sum,high_sum);
        }
        return high_sum;
    }

}
