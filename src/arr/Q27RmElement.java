package arr;

public class Q27RmElement {
    public static void main(String[] args){
        int [] nums = new int[]{4,5};
        System.out.println (removeElement(nums, 4));
    }
    public static int removeElement(int[] nums, int val){
        if (nums.length == 0)
            return 0;
        //setup left and right pivot, left for looping, right for swapping
        int i = 0;
        int j = nums.length -1;

        while (nums[j] == val){
            j--;
            if(j < 0)
                return 0;
        }

        while (i<j){
            if(nums[i] == val){
                nums[i] = nums [j];
                j--;
                while (nums[j] == val){
                    j--;
                    if(j < 0)
                        return 0;
                }
            }
            i++;
        }
        return (i==j) ? i+1:i;

    }
}
