import java.util.Arrays;

public class bubbleSort{
    

    public static void main(String[] args){
        int[] arr = {5,7,2,3,9,4};
        int n = arr.length;
        System.out.println(Arrays.toString(bubbleSortSid(arr,n)));
    }
    public static int[] bubbleSortSid(int[] arr , int n){
        int temp = 0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}