import java.util.Scanner;

public class kadaneAlogo {
    public static int maxSubarraySum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubarraySum(nums));
    }
}
