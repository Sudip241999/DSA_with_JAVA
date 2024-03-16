package ArrayProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class arrayHardProblems {
    static int nCr(int n,int r){
        int ans=1;
        for(int i=1;i<=r;i++){
            ans=ans*n;
            n--;
            ans=ans/i;
        }
        return ans;
    }
    static void printingSpecificPosElementInPascalTriangle(int row,int column ){
        int result=nCr(row-1, column-1);
        System.out.println(result);
    }

    static void printingRowOfAPascalTriangle(int row){
        for(int i=1;i<=row;i++){
            System.out.print(nCr(row-1, i-1)+" ");
        }
    }

    static void pascalTriangle(int n){
        ArrayList<List<Integer>>result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(int j=1;j<=i;j++){
                temp.add(nCr(i-1, j-1));
            }
            result.add(temp);
            

        }
        System.out.println(result);
    }


    static void majorityOfTheElements(int []nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer e:nums){
            if(map.containsKey(e)){
                map.put(e,map.get(e)+1);
            }
            else{
                map.put(e, 1);
            }
        }
        int length=nums.length;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>length/3){
                System.out.println(e.getKey());
            }

        }
        
    }

    static void ThreeSome(int []nums){
        ArrayList<List<Integer>>result=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                
                for(int k=j+1;k<nums.length;k++){
                    ArrayList<Integer>temp=new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(temp.size()==3 && set.contains(temp)==false){
                            set.add(temp);
                            result.add( temp);
                            }
                    }
                }               
            }
        }
        System.out.println(result);
    }


    static void threesome(int []nums){
        ArrayList<List<Integer>>result=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                
            int first=i+1;
            int last=nums.length-1;
            while(first<last){
                
                if(nums[i]==(nums[first]+nums[last])){
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[first]);
                    temp.add(nums[last]);
                    if(set.contains(temp)==false){
                        set.add(temp);
                        result.add( temp);
                        }

                }
                else if(nums[i]<(nums[first]+nums[last])){
                    while(nums[last]==nums[last-1]){
                        last--;
                    }
                }
                else{
                    while(nums[first]==nums[first+1]){
                        first++;
                    }
                }
            }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};
      threesome(arr);

    }
    
}
