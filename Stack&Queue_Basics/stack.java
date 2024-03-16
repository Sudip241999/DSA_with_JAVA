import java.util.*;

class stack{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        stack1 ob=new stack1();
        boolean i=true;

        while(i){
        System.out.println("push an item ,press 1");
        System.out.println("pop an item press 2");
        System.out.println("to show the peek value press 3");
        System.out.println("to display the stack press 4");
        System.out.println("to exit press 5");
        System.out.println("choose the operation:");
        int a=sc.nextInt();

        switch(a){
            case 1:
            System.out.print("enter the item you want to push :");
            int item=sc.nextInt();
            ob.push(item);
            break;

            case 2:
            System.out.println("removed item is : "+ob.pop());
            break;
            case 3:
            System.out.println("top most item : "+ob.peek());
            break;
            case 4:
            ob.display();
            System.out.println();
            break;
            case 5:
            i=false;
            break;
            default:
            System.out.println("invalid number");



        }
        }

    }
}


class stack1{
    private static int top;
    
    private static int size;
    private static int[] arr;
    stack1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the stack :");
        size=sc.nextInt();
        arr=new int[size];
        top=-1;

    }

    void push(int item){
        if(top==size-1){
            System.out.println("Stack Overflow");
        }
        else{
            top+=1;
            arr[top]=item;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty!");
            return -1;
        }
        else{
            int item=arr[top];
            top-=1;
            
            return item;
        }
    }
    int peek(){
        if(top==-1){
            return -1;
        }
        else{
        int item=arr[top];
        return item;
        }    
    }

    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
    }
}