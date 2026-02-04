
import java.util.*;

public class majorityElement {
    public static int majorityElement(int[] nums){
        int count = 0;
        int el = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el = nums[i];
                count++;
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }

        }
        int count1 = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el){
                count1++;
            }
        }
        if(count1>nums.length/2){
            ans=el;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
}
