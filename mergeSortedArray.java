import java.util.Arrays;

public class mergeSortedArray {
    public static void mergeArray(int[] nums1, int n, int[] nums2, int m){
        int i = n-1;
        int j = m-1;
        int k = n+m-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]= nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0};
        int[] nums2 = {2,5,7};
        int n = 4;
        int m = 3;
        mergeArray(nums1, n, nums2, m);
        System.out.println(Arrays.toString(nums1));
    }
}
