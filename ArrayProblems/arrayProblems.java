package ArrayProblems;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class arrayProblems {
    static void largestElement(int []arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        
    }

    static void secondLargestElement(int []arr){
        int max=arr[0];
        int secondMax=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
        }
        System.out.println(secondMax);
    }

    static void checkSorted(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

    static void removeDuplicates(int []arr){
        HashSet<Integer>set=new HashSet<>(); 
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                continue;
            }
            else{
                set.add(arr[i]);
                arr[j]=arr[i];
                j++;
            }

        }
        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }
    }

    static void leftRotateByOnePlace(int []arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=temp;
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }


    static void leftRotateByNumberOfPlace(int[]arr,int k){
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;
        }

     
        
        for(int y=0;y<arr.length;y++){
            System.out.print(arr[y]+" ");
    }
}

    static void zerosToEnd(int []arr){
        int count=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                arr[j]=arr[i];
                j++;
            }
        }
        for(int y=0;y<count;y++){
            arr[j]=0;
            j++;
        }

        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }

    static void missingNumber(int n,int[]arr){
        
        for(int i=1;i<n;i++){
           
            int j=0;
            while(j<arr.length){
                if(i==arr[j]){
                    break;
                }
                j++;
            }
          
            if(j==arr.length){
                System.out.println(i);
            }
        }
    }


    static void maximumConsecutive1s(int []arr){
        int result=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==1){
                count++;
                if(count>result){
                    result=count;
                }
            }
            else{
                count=0;
            }
            
    }
    System.out.println(result);
}


    static void numberThatAppearsOne(int[]arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int e:arr){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e, 1);
            }
        }
        for(Map.Entry<Integer,Integer>p:map.entrySet()){
            if(p.getValue()==1){
                System.out.println(p.getKey());;
            }
        }
    }

    static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }
        System.out.println(maxLen);
        return maxLen;
    }

    public static void main(String[] args) {
        int []arr={2,2,1};
        getLongestSubarray(arr, 5);
        
    }
    
}
