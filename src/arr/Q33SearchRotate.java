package arr;

public class Q33SearchRotate {
    public static void main (String[] args){
        int[] nums = new int[]{4,5,6,7,8,1,2,3};
        System.out.println(search(nums, 2));
    }

    private static int search(int[] nums,  int target){
        /*First thought, this is still binary search problem
        * There are two cases after dividing into two parts, part is in order/not
        * If target is in ordered part, easy
        * If not keep dividing until found
        * */
        return help_finder(nums, 0, nums.length-1, target);
    }

    private static int help_finder(int[] nums, int i, int j, int target){
        if((nums.length == 0) || ( i == j && nums[i] != target))
            return -1;

        int mid = (j+i)/2;

        if(nums[i] == target)
            return i;
        else if (nums[j] == target)
            return j;
        else if (nums[mid] == target)
            return mid;
        else{
            if (nums[i] <= nums[mid] && (nums[i] < target && nums[mid] >=target))
                return help_finder(nums, i, mid, target);
            else if (nums[i] <= nums[mid] && !(nums[i] < target && nums[mid] >=target))
                return help_finder(nums, mid + 1, j, target);
            else if(nums[mid+1] <= target && target< nums[j])
                return help_finder(nums, mid+1, j, target);
            else
                return help_finder(nums, i, mid, target);
            }
        }

}
