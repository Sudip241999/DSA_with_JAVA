package binarySearchProblems;
public class binarySearchProblems {

    static int binarySearch(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
                
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    static void lowerBound(int []arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=k){
                System.out.println(mid);
                break;
            }
            else{
                low=mid+1;
            }
        }
    }


    static int lastOccurrenceInASortedArray(int []arr,int target){
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                return i;
            }
           

        }
         return -1;
    }


    static void countOccurrencesinSortedArray(int []arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);

    }
    static String removeOuterParentheses(String s) {

        int count=0;
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    result+=s.charAt(i);
                }
            }
            else{
                count--;
                if(count>0){
                    result+=s.charAt(i);
                }
            }
        }
        return result;
        
    }


    static String longestCommonPrefix(String[] strs) {

        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(s)!=-1){
                s=s.substring(0, s.length()-2);
            }
        }
        return s;
        
        
    }

    public static void main(String[] args) {
        // int []arr={3,4,13,13,13,20,40};

        String []s={"flower","flow","flight"};
        
       System.out.println(longestCommonPrefix(s));;
    }
    
}
