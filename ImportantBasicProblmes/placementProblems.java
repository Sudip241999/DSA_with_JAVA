package ImportantBasicProblmes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class placementProblems {

    static void numberOfPrime(int n){
        HashSet<Integer>set=new HashSet<>();
        int sum=0;
        //numbers to take :
        for(int i=2;i<n;i++){ 
            //checking prime or not:          
            Boolean flag=false;

            for(int x=2;x<=i/2;x++){
                if(i%x==0){
                    flag=true;
                    break;
                }
            }
            // if prime then add with sum  
            if(flag==false){
                sum+=i;
                //if sum is less than the given number 
                if(sum<=n){
                    //again checking the sum is prime or not
                    Boolean flag1=false;
                    for(int y=2;y<=sum/2;y++){
                            if(sum%y==0){
                                flag1=true;
                                break;
                            }

                    }
                    //if prime and greater than 2 then adding to the set
                    if(flag1==false && sum>2){
                            set.add(sum);
                    }
                
                }
                //if sum is greater than the given number then print the size and return
                else{
                    System.out.println(set.size());
                    return;
                    }
            }                
        }
        
    }


    static void classificationOfRockSize(int sampleSize,int noOfRange){
        //collecting the elements : 

        int[]arr=new int[sampleSize];
        Scanner sc=new Scanner(System.in);
        int j=0;
        for(int i=0;i<sampleSize;i++){
            System.out.println("Enter the element : ");
            
            int temp=sc.nextInt();
            arr[j]=temp;
            j++;

        }
        // printing the array elements

        for(int k=0;k<j;k++){
            System.out.print(arr[k]+" ");
        }

        int[]range=new int[noOfRange*2];
        int idx=0;
        for(int x=0;x<noOfRange;x++){

            for(int y=0;y<2;y++){
                System.out.println("enter range"+(y+1)+"");

                int temp1=sc.nextInt();
                range[idx]=temp1;
                idx++;
            }

        }

        for(int z=0;z<j;z++){
            for(int p=1;p<range.length;p++){
                if(arr[z]<range[p]){
                    System.out.println(arr[z]+" lies between "+range[p-1]+"and"+range[p]);
                    break;
                }
            }
        }

    }



    static void kThLargestFactor(int n,int k){
        ArrayList<Integer>list=new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }

        }
        if(list.size()-k<0){
            System.out.println(1);
            return;
        }
        System.out.println(list.get(list.size()-k));

    }
    public static void main(String[] args) {

        kThLargestFactor(30, 9);
       
        
    }
    
}