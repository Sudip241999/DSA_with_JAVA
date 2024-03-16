import java.util.Scanner;

public class circularQueue {
    public static void main(String[] args) {
        boolean i=true;
        queue ob=new queue();
        Scanner sc=new Scanner(System.in);
        while(i){
            System.out.println("ENQUEUE : 1");
            System.out.println("DEQUEUE : 2");
            System.out.println("DISPLAY : 3");
            System.out.println("EXIT :    4");
            System.out.println();
            System.out.println("CHOOSE THE OPERATION : ");
            int a=sc.nextInt();
            switch(a){
                case 1:
                System.out.println("ENTER THE ITEM :");
                int item=sc.nextInt();
                ob.enqueue(item);
                break;
                case 2:
                System.out.println("removed item is : "+ob.dequeue());
                break;
                case 3:
                ob.display(); 
                break;
                case 4:
                i=false;
                break;
                default:
                System.out.println("INVALID NUMBER");
            }
        }
        
    }
}

class queue{
    private static int [] arr;
    private static int size;
    private static int rear;
    public static int front;
    queue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        size=sc.nextInt();
        arr=new int[size];
        rear=-1;
        front=-1;
    }
    void enqueue(int item){
        if (front==(rear+1)%size){
            System.out.println("queue is full");
        }
        else{
            rear=(rear+1)%size;
            arr[rear]=item;
            if (front==-1){
                front=0;
            }
        }
    }
    int dequeue(){
        if(front==-1 && rear==-1){
            return -1;
        }
        else{
        int item=arr[front];
        front=(front+1)%size;
        if(front==rear){
            front=-1;
            rear=-1;
        }
        return item;

        }

    }

    void display(){
        if(front==-1 && rear==-1){
            System.out.println("empty");
        }
        else{
            for(int i=front;i!=rear;i=(i+1)%size){

                System.out.print(arr[i]+" ");

            }
            System.out.println(arr[rear]);
        }
    }
}
