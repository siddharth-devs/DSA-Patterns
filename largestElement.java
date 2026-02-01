public class largestElement {
    public static int largest(int[] nums){
        int largest = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {1,10,10,10,11};
        System.out.println(largest(nums));
    }
}
