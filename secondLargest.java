public class secondLargest {
    public static int secondLargestElement(int[] nums){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int n = nums.length-1;
        for(int i=1;i<n;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>second && nums[i]!=largest){
                second = nums[i];
            }
        }

        if(second == Integer.MIN_VALUE){
            return -1;
        }

        return second;
    }

    public static void main(String[] args) {
        int[] nums = {12,1,5,74,89,15};
        System.out.println(secondLargestElement(nums));
    }
}
