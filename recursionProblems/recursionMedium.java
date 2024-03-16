package recursionProblems;
import java.util.*;

public class recursionMedium {

    static void towerOfHanoi(int n,String source,String helper,String destination){

        if(n==1){
            System.out.println("shifting "+n+" from "+source+" to "+destination);
            return;
        }

        else{
            towerOfHanoi(n-1, source,destination,helper);
            System.out.println("shifting "+n+" from "+source+" to "+destination);
            towerOfHanoi(n-1,  helper,source, destination);
        }
    }

    static void reverseString(String s,int i){

        if (i==-1){
            return;
        }
        else{
            
            System.out.print(s.charAt(i));
            reverseString(s,i-1);

        }

    }

    static boolean isSorted(int i,int [] arr){
        if(i==arr.length-1){
            return true;
        }
        else if(arr[i]>=arr[i+1]){
            return false;
        }
        else{
            return isSorted(i+1, arr);
        }

    }

    static void moveElementToEnd(int i,String s,String newString,int count){
        if(i==s.length()){
            for(int j=0;j<count;j++){
            newString+="x";

        }
            System.out.println(newString);
           return; 
        }
        char current=s.charAt(i);
        if(current=='x'){
            count++;
            moveElementToEnd(i+1, s, newString, count);
        }
        else{
           newString+=current;
            moveElementToEnd(i+1, s, newString, count);

        }
        
    }
    public static boolean [] arr=new boolean[26];

    static void removeDuplicates(int i,String s,String newString){
        if (i==s.length()){

        System.out.println(newString);
        return;

        }
        
        char current=s.charAt(i);
        if(arr[current-'a']==true){
            removeDuplicates(i+1, s, newString);
        }
        else{
            newString+=current;
            arr[current-'a']=true;
            removeDuplicates(i+1, s, newString);
        }
    }

    public static void subSequences(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
            
            return;
            }
            System.out.println(newString);
            set.add(newString);
            return;
        }
        char current=str.charAt(idx);

        //to be
        subSequences(str, idx+1, newString+current,set);

        //or not to be
        subSequences(str, idx+1, newString,set);
    }

    public static String [] keypad={".","abc","def",
                                    "ghi","jkl","mno",
                                    "pqrs","tu","vwx",
                                    "yz"};
    public static void KeypadCombination(String str,int idx,String combination){

        char current=str.charAt(idx);
        String mapping=keypad[current-'0'];

        for(int i=0;i<mapping.length();i++){
            KeypadCombination(str, idx+1, combination+mapping.charAt(i));
        }
         

    }


    public static void main(String[] args) {
        // int n=3;
       
        // towerOfHanoi(n,"s","h","d");
        // String s="sudip";
        // int i=s.length()-1;
        // reverseString(s, i);

        // int [] arr={1,7,2,3,4};
        // System.out.println(isSorted(0, arr));

        // String s="suxdxixp";
        // int count=0;
        // int i=0;
        // String newString="";
        // moveElementToEnd(i, s, newString, count);

        HashSet<String> set=new HashSet<>();
        String s="aaa";
        String newString="";
        subSequences(s, 0, newString,set);
        
    }

}



