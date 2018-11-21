package arr;

public class Q34FindPosition {
    public static void main(String[] args){
        int[] nums = new int[]{5};
        System.out.println(searchRange(nums, 5)[0]);
    }
    public static int[] searchRange(int[] nums, int target) {
        /*First thought, binary search and loop both side
        * */
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length-1])
            return new int[]{-1,-1};

        return searchRecursive(nums, target, 0, nums.length-1);
    }

    private static int[] searchRecursive(int[] nums, int target, int i, int j){
        if ( i==j && nums[i] != target)
            return new int[]{-1,-1};

        if( nums[i] > target || nums[j] < target)
            return new int[]{-1, -1};

        int mid = (i+j)/2;


        if (target == nums[i])
            return loop(nums, target, i);
        else if (target == nums[j])
            return loop(nums, target, j);
        else if (target == nums[mid])
            return loop(nums, target, mid);
        else {
            if (target > nums[mid])
                return searchRecursive(nums, target, mid + 1, j);
            else
                return searchRecursive(nums, target, i, mid);
        }
    }

    private static int[] loop(int[] nums, int target, int p){
        int i = p;
        int j = p;
        while(i >=0 && nums[i] == target)
            i--;
        while(j<nums.length && nums[j] == target)
            j++;

        return new int[]{i+1,j-1};
    }
}
