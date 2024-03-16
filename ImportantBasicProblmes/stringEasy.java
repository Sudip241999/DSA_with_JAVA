package ImportantBasicProblmes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class stringEasy {
   
    static void reverseWordsinaString(String s){
        String arr[]=s.split(" ");
        String newString="";
        for(int i=arr.length-1;i>-1;i--){
            if(arr[i]==""){
                continue;
            }
            else{
                newString=newString+arr[i]+" ";
            }
            
    }
    System.out.println(newString);
}

    static void largestOddNumberInAString(String num){
        
       while(num!=""){
        int temp=num.charAt(num.length()-1)-'0';
        if(temp%2==1){
            System.out.println(num);
            break;
        }
        else{
            num=num.substring(0, num.length()-1);
        }
       }
       System.out.println(num);

    }

    static Boolean isomorphicString(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int []map1=new int[s.length()];
        int []map2=new int[t.length()];
        for(int i=0;i<s.length();i++){
            map1[i]=s.indexOf(s.charAt(i));
        }
        
        for(int j=0;j<t.length();j++){
            map2[j]=t.indexOf(t.charAt(j));
        }
        if(Arrays.equals(map1,map2)){
            return true;
        }
        return false;
    }

    static boolean rotateString(String s, String goal) {
        String temp=s;
        while(true){
            if(s.equals(goal)){
                return true;
            }
            else{
                s=s.substring(s.length()-1)+s.substring(0,s.length()-1);
                if(s.equals(goal)){
                    return true;
                }
                else{
                    if(s.equals(temp)){
                        return false;
                    }
                }
            }
        }
        
    }

    static boolean isAnagram(String s, String t) {
        char []map1=s.toCharArray();
        char []map2=t.toCharArray();
        Arrays.sort(map1);
        Arrays.sort(map2);
        if(Arrays.equals(map1, map2)){
            return true;
        }
        return false;
    }

    static String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        String newString="";
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                
                map.put(s.charAt(i),map.get(s.charAt(i))+1);

            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(newString==""){
                newString+=s.charAt(i);
            }
            else{
                if(map.get(s.charAt(i))>=map.get(newString.charAt(0))){
                    newString=s.charAt(i)+newString;
                }
                else{
                    newString+=s.charAt(i);
                }
            }
        }
        System.out.println(newString);
        return newString;
    }

    static int lengthOfLongestSubstring(String s) {
      if(s==""){
          return 0;
      } 
      
          HashSet<Character>set=new HashSet<>(); 
      int count =0;
      int maxLength=0;
      for(int i=0;i<s.length();i++){
        
          if(set.contains(s.charAt(i))){
            count=0;
            set.removeAll(set);
            break;
          }
          else{
            set.add(s.charAt(i));
            count++;
            maxLength=Math.max(maxLength, count);
          }
      }
      return maxLength;

    }

    static String reverseString(String s){
        String newString="";
        for(int i=s.length()-1;i>=0;i--){
            newString+=s.charAt(i);
        }
       
        return newString;
}


    static void longestPalindromicString(String s){
        int maxCount=0;
        String result="";
        for(int i=0;i<s.length();i++){
            int j=i;
            int high=s.length()-1;
            int count=0;
            String temp="";
            Boolean flag=false;
            while(j<=high){
                if(s.charAt(j)==s.charAt(high)){
                    count++;
                    j++;
                    high--;
                }
                else{
                    if(j==i){
                        high--;
                    }
                    else{
                        flag=true;
                        break;
                    }
                    
                }
            }
            if(flag=true){
                continue;
            }
            else{
                if(maxCount<count){
                    for(int k=i;k<s.length();k++){
                    temp+=s.charAt(k);
                    }
                    maxCount=Math.max(maxCount,count);
                     result=temp;
                }
                
            }
           
        }
        System.out.println(result);

    }
        
    public static void main(String[] args) {
        
        String s="abcabcbb";
        longestPalindromicString(s);

    }
    
}
