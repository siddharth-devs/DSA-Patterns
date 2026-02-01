import java.util.*;
public class reverseArray {
    public static void reverse(int[] nums){
        int s = 0;
        int e = nums.length-1;
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;

            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
}
