import java.util.Arrays;

public class move {
    public static void move(int[] nums){
        int j = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] !=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
