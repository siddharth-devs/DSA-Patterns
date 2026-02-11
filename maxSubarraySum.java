import java.util.Scanner;

public class maxSubarraySum {
    public static void maxSubarraySum(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;
        int end = 0;
        int tempstart = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(sum > max){
                max = sum;
                start = tempstart;
                end = i;
            }

            if(sum<0){
                sum = 0;
                tempstart = i+1;
            }
        }

        System.out.println("Maximum Subarray Sum ="+ max);
        System.out.print("Subarray =");
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");
        }

    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        maxSubarraySum(nums);
    }
    
}
