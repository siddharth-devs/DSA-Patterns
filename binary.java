
public class binary{
    
    public static int binary(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,9};
        int target = 10;
        System.out.println(binary(nums,target));
    }
    
    
}