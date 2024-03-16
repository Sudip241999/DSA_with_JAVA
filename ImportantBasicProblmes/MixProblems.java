package ImportantBasicProblmes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MixProblems{
   static void convert(String s){
    int num=0;
    for(int i=0;i<s.length();i++){
        int temp=s.charAt(i)-'0';
        System.out.println(temp);
        num=num*10+temp;
        

    }
    System.out.println(num);

}
    static void removeChar(String s,int idx){
        String temp="";
        for (int i=0;i<s.length();i++){
            if (i!=idx){
                temp+=s.charAt(i);
            }
            

        }
        System.out.println(temp);
    }
    static void length(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp!=' '){
                    count++;

            }
        }
        System.out.println(count);

    }
    static void evenLength(String s){
        int count=0;
        String temp="";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(count%2==0){
                    System.out.println(temp);
                    
                }
                temp="";
                count=0;
            }
            else{
                temp+=s.charAt(i);
                count+=1;
            }
        }
        if (count%2==0){
            System.out.println(temp);
        }
    }
    static void halfUpper(String s){
        String temp1=s.substring(0, (s.length())/2);
        String temp2=s.substring((s.length())/2, s.length());
        String newString=temp1.toUpperCase()+temp2;

        System.out.println(newString);
    }



    static void capatalize(String s){
        String newString="";
        String [] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==1 || arr[i].length()==2){
                String temp=arr[i].toUpperCase();
                newString+=temp+" ";

            }
            else{
                String first=arr[i].substring(0, 1);
                String middle=arr[i].substring(1, arr[i].length()-1);
                String last=arr[i].substring(arr[i].length()-1);
                newString+=first.toUpperCase()+middle+last.toUpperCase()+" ";
            }
        }
        System.out.println(newString);
    }

    static void matching(String s1,String s2){
        int count=0;
        for (int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    static void allDuplicates(String s){
        String newString="";
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(newString.indexOf(temp)<0){
                newString+=temp;
            }

        }
        System.out.println(newString);           
    }

    static void maxFrequent(String s){

        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        int max=0;
        for(Integer e:map.values()){
            if(max<e){
                max=e;
            }
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            if(e.getValue()==max){
                System.out.println(e.getKey());
            }
        }


    }
    static void leastFrequent(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
    
        System.out.println(map);
        int min=0;
        for(Integer e:map.values()){
            
            if(min>e){
                min=e;
            }
            else{
                if(min==0){
                    min=e;
                }
            }

        }
        System.out.println(min);
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            if(e.getValue()==min){
                System.out.println(e.getKey());
                break;
            }
        }
    }

    static void oddFrequency(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){

            if(e.getValue()%2!=0){
                System.out.println(e.getKey());
            }

        }
    }

    static void specificChar(String s,Character c){

        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);   
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        if(map.get(c)==null){
            System.out.println("not in string");
        }
        else{
            System.out.println(map.get(c));
        }

    }

    static void cheakSpecial(String s){

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'!' && s.charAt(i)<'A' && s.isN){
                System.out.println("True");
                return;

            }
            
        }
        System.out.println("False");

    }

    static void greaterLengthWord(String s,Integer len){
        String []arr=s.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], arr[i].length());
        }

        for(Map.Entry<String,Integer>e:map.entrySet()){
            if(e.getValue()>=len){
                System.out.println(e.getKey());
            }
        }
    }

    static void removeIthChar(String s,int i){
        String newString="";
        for(int j=0;j<s.length();j++){
            if(j!=i){
                newString+=s.charAt(j);


            }
        }
        System.out.println(newString);
    }

    static void replaceCommaAndDot(String s){
        String newString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==','){
                newString+='.';
            }
            else if(s.charAt(i)=='.'){
                newString+=',';
            }
            else{
                newString+=s.charAt(i);
            }
        }
        System.out.println(newString);
    }

    static void convertStringToInteger(String s){
        int result=0;
        for(int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'0';
            result=result*10+temp;
        }
        System.out.println(result);
    }

    static void locationOfWord(String sentence,String word){
        System.out.println(sentence.indexOf(word));
    }
    static void consecutiveFrequency(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length()-1;i++){
            int count=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count+=1;
                }
                else{
                    break;
                }
            }
            if(count>1){
                map.put(s.charAt(i),count);
            }
            
        }
        System.out.println(map);
    }

    static void rotate(String s,int k){
        for(int i=0;i<k;i++){
            String first=s.substring(0, s.length()-1);
            String last=s.substring(s.length()-1, s.length());
            s=last+first;
        }
        System.out.println(s);
    }

    static void recursivelyEmpty(String s){
        if(s==""){
            System.out.println("empty");
            return;
        }
        recursivelyEmpty(s.substring(1, s.length()));

    }

        static void rotateToGetActualString(String s)
        {
            String temp=s;
            String first=s.substring(0, s.length()-1);
            String last=s.substring(s.length()-1, s.length());
            s=last+first;
            int count=1;
            while(temp.compareTo(s)!=0){
                
                first=s.substring(0, s.length()-1);
                last=s.substring(s.length()-1, s.length());
                s=last+first;
                count++;
            


            }
            System.out.println(count);

                    
    }

        static void majorityElements(int[]arr){
            HashMap<Integer,Integer>map=new HashMap<>();
            ArrayList<Integer>result=new ArrayList<>();
            for (int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                    if(map.get(arr[i])>=arr.length/3){

                        result.add(arr[i]);

                    }
                    
                }
                else{
                    map.put(arr[i],1);
                }
            }
            
            System.out.println(result);
        }
        static void unionOfTwoArray(int[]arr1,int[]arr2){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<arr1.length;i++){
                map.put(arr1[i],1);
            }
            for(int j=0;j<arr2.length;j++){
                map.put(arr2[j],1);
            }
            System.out.println(map.keySet());
        }

        static void intersectionOfTwoArray(int[]arr1,int[]arr2){
            HashMap<Integer,Integer>map=new HashMap<>();
            ArrayList<Integer>result=new ArrayList<>();
            for(int i=0;i<arr1.length;i++){
                map.put(arr1[i],1);
            }
            for(int j=0;j<arr2.length;j++){
                if(map.containsKey(arr2[j])){
                    result.add(arr2[j]);
                }
            }
            System.out.println(result);
        }

        static void closeMatches(String s,String[]arr){
            for(String e:arr){
                if(e.indexOf(s)>-1){
                    System.out.println(e);
                }
            }
        }




    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // char a=sc.next().charAt(0);

        // System.out.println(a);
        // convert(a);
        // removeChar(a,2);       
        // length(a);
        //  evenLength(a);
        // halfUpper(a);
        // capatalize(a);
        // matching("susmita", "sudip");
        // allDuplicates("geeksforgeeks");
        // maxFrequent("suduuip");
        // leastFrequent("sudip");
        // oddFrequency("Sudiiidpppp");
        // specificChar("geeksforgeeks", 'g');
        //cheakSpecial("sudip24");
        // greaterLengthWord("Sudip chakraborty", 6);

        // removeIthChar("sudip", 3);
        // replaceCommaAndDot("sudip,is.");
        // convertStringToInteger("23");
        // locationOfWord("sudip is a good boy", "good");
        // consecutiveFrequency("suudip");
        // rotate("sudip", 2);
        // recursivelyEmpty("suudip");
        // rotateToGetActualString("sudip");
        // int[]arr={1,2,6,1,3,1};
        // int[]arr1={1,6,4,9};
        // majorityElements(arr);
        // unionOfTwoArray(arr, arr1);
        // intersectionOfTwoArray(arr, arr1);
        // String []s1={"tiger","lion","li"};
        // String s2="li";
        // closeMatches(s2, s1);

    }
}