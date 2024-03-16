package ArrayProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class arrayMediumProblems {
    static void TwoSum(int []arr,int sum){
        int []result={-1,-1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Yes");
                    result[0]=i;
                    result[1]=j;
                    return;
                }
            }
        }
        System.out.println("No");
    }


    static void sortArrayThreeNum(int[]arr){

        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==1){
                mid++;
                
            }
            else if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }

    }


    static void majorityElement(int []arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        int len=arr.length/2;
        
        for(int i=0;i<arr.length;i++){
            
            if(map.containsKey(arr[i])){

                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);

            }
        }

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>len){
                System.out.println(e.getKey());
            }
        }

    }



    static void maximumStockPrice(int []arr){
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    maxProfit=Math.max(arr[j]-arr[i], maxProfit);
                }
                else{
                    break;
                }
            }

        }
        System.out.println(maxProfit);
    }

    static void rearrangeArrayElementsbySign(int arr[]){
        ArrayList<Integer>positiveList=new ArrayList<>();
        ArrayList<Integer>negativeList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positiveList.add(arr[i]);
            }
            else{
                negativeList.add(arr[i]);
            }
        }
        int []result=new int[arr.length];
        int q=0;
        int p=1;
        result[0]=positiveList.get(0);
        for(int j=1;j<result.length;j++){
            if(result[j-1]>=0){
                result[j]=negativeList.get(q);
                q++;
            }
            else{
                result[j]=positiveList.get(p);
                p++;
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }


    }


    static void longestConsecutiveSequenceInAnArray(int []arr){
        if(arr.length==0){
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        int count=1;
        int maxCount=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
                maxCount=Math.max(maxCount, count);
            }
            else if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count=1;
            }
        }
        System.out.println(maxCount);
    }

    static void setMatrixZero(int [][]matrix){
        HashSet<Integer>columnSet=new HashSet<>();
        HashSet<Integer>rowSet=new HashSet<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    columnSet.add(j);
                    rowSet.add(i);

                }
            }
        }
        System.out.println(columnSet);
        System.out.println(rowSet);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rowSet.contains(i)){
                    matrix[i][j]=0;
                }
                else if(columnSet.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }


    static void  printingMaximumSubarraySumInAnArray(int []arr){
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;
        int maximumSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>maximumSum){
                ansStart=start;
                ansEnd=i;

            }
            maximumSum=Math.max(sum,maximumSum);
            if(sum<0){
                
                sum=0;
            }
            
        }
        System.out.println(maximumSum);
       
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
        
    }


    static void leadersInanArray(int []arr){
        for(int i=0;i<arr.length;i++){
            Boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void rotateImageby90degree(int [][]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[i].length;j++){
                if(i!=j){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
        for(int x=0;x<arr.length;x++){
        int start=0;
        int end=arr[x].length-1;
        while(start<end){
            int temp1=arr[x][start];

            arr[x][start]=arr[x][end];
            arr[x][end]=temp1;
            start++;
            end--;
          }
        }
        
    }


    static void countSubarraySumEqualsK(int [] nums,int k){
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==k){
              count++;
              continue;
              }
            
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                    break;
                }

            }
        }
        System.out.println(count);


    }




    






    public static void main(String[] args) {
        
        int []arr={1,1,1};
       countSubarraySumEqualsK(arr, 2);
    }
    
}
