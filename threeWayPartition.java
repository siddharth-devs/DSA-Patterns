import java.util.Arrays;

public class threeWayPartition {
    public static void rearrange(int[] nums){
        int start= 0;
        int mid = 0;
        int end = nums.length-1;
        int pivot = 3;

        while(mid<=end){
            if(nums[mid]<pivot){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;

                start++;
                mid++;
            }
            else if(nums[mid] ==pivot){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;

                end--;
            }

        }
    }
    public static void main(String[] args) {
        
        int[] nums = {3,5,2,1,4,2,3,6};
        rearrange(nums);
        System.err.println(Arrays.toString(nums));
    }
}
