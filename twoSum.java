import java.util.*;
public class twoSum{
    public static int[] twoSum(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, k)));
    }
}