import java.util.Scanner;

public class containerWithMostWater {
    public static int maxAreaWater(int[] nums){
        int l = 0;
        int r = nums.length-1;
        int maxArea = 0;
        while(l<=r){
            int h = Math.min(nums[l], nums[r]);
            int w = r-l;
            int area = h*w;

            maxArea = Math.max(maxArea, area);

            if(nums[l]<nums[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maxAreaWater(nums));
    }
}
