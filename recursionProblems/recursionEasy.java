package recursionProblems;
public class recursionEasy {


    static void numbers(int num){


        if (num==1){System.out.println(num);}
        else{
           System.out.println(num);
           numbers(num-1);
        }
    }
    static int sum(int a){
        int Sum=0;
        if(a==0){
            return Sum;
        }
        else{
            Sum+=a;
            return Sum+sum(a-1);
        }
        
    }
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
            
        }
        
    }

    static void Fibonacci(int a,int b,int n){
        if(n==0){
            return ;
        }
        else{
            int c=a+b;
            System.out.println(c);

            Fibonacci(b, c, n-1);
        }

    }

    
     

    public static void main(String[] args) {
        int n=7;
        int a=0;
        int b=1;

        Fibonacci(a,b,n);
    }
    
}
