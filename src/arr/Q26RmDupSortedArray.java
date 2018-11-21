package arr;

public class Q26RmDupSortedArray {
    public static void main(String[] args){
        int[] nums = new int[]{1,1};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        //problem requires in-place work, therefore loops through and swap values
        //corner cases
        if (nums.length<=1)
            return nums.length;

        int i=0; //i stands for the left pivot starting point of dup
        int j=1; //j stands for the right pivot ending point of dup
        int k=1; //k stands for the left most available position

        while (j < nums.length){
            while (j<nums.length && nums[j] == nums[i] ){
                j++;
            }
            if(j<nums.length){
                nums[k] = nums [j];
                k++;

                i=j;
                j++;
            }
        }
        return k;


    }
}
