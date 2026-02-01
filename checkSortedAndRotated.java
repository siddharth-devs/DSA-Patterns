public class checkSortedAndRotated {
    public static boolean sortedAndRotated(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count+=1;
            }
        } 

        if(nums[0] < nums[nums.length-1]){
            count+=1;
        }

        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(sortedAndRotated(nums));
    }
}
