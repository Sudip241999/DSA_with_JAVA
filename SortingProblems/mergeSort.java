package SortingProblems;
import java.util.ArrayList;

public class mergeSort {
    static int []  merge(int []arr,int low,int mid,int high){
        ArrayList<Integer>temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
                System.out.println(temp);
            }
            else{
                temp.add(arr[right]);
                System.out.println(temp);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);

            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

        
        System.out.println(temp);
        return arr;
    }
    static void mS(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
 public static void main(String[] args) {
    int []arr={1,6,54,6,7,1,2};
    mS(arr, 0, 6);

    }   
}
