package arr;

public class Q35searchInsert {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 2));

    }
    public static int searchInsert(int[] nums, int target) {
        //this is binary search
        //complexity Ologn
        //highlights return i++ will return i
        if (nums.length==0)
            return 0;


        return searchHelper(nums,target, 0, nums.length -1);
    }

    private static int searchHelper(int[] nums, int target, int left, int right){
        int mid = left + (right - left)/2;
        if (right - left == 0){
            return nums[left] >= target ? left:left+1;
        }

        if (nums[mid] == target){
            return mid;
        }else if (nums[mid] > target){
            return searchHelper(nums, target, left, mid);
        }else {
            return searchHelper(nums, target, ++mid, right);
        }

    }
}
