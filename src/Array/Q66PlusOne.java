package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q66PlusOne {
    public static void main(String[] args){
        int[] digits = new int[]{9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        //this is a carry foward adder
        int a = 0;
        int b = 1;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = digits.length-1; i>=0; i--){
            sum = b + digits[i];
            if(sum>9){
                a = sum - 10;
                b = 1 ;
            }else {
                a = sum;
                b = 0 ;
            }
            result.add(0, a);
        }

        if(b > 0)
            result.add(0, b);

        return result.stream().mapToInt(i -> i).toArray();


    }
}
