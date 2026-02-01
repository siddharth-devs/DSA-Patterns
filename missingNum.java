public class missingNum {
    public static int missing(int[] arr){
        int sum = 0;
        int n = arr.length;
        int sum1 = n*(n+1)/2;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }

        return (sum1-sum);
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missing(arr));
    }
}
