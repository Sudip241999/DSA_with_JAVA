import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Queue1 ob=new Queue1();
        boolean i=true;
        while(i){
            System.out.println("ENQUEUE : 1");
            System.out.println("DEQUEUE : 2");
            System.out.println("DISPLAY : 3");
            System.out.println("EXIT :    4");
            System.out.println();
            System.out.println("CHOOSE THE OPERATION :");
            Scanner sc=new Scanner(System.in);
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


class Queue1{
    private static int size;
    private static int[] arr;
    private static int rear;
    private static int front;

    Queue1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the queue: ");
        size=sc.nextInt();
        arr=new int[size];
        front=-1;
        rear=-1;

    }
    void enqueue(int item){
        if(rear==size-1){
            System.out.println("Queue is full");
        }
        else{
            rear+=1;
            arr[rear]=item;
            if(front==-1){
                front=0;
            }
        }
    }
    int dequeue(){
        if(front==-1){
            return -1;
        }
        else if(rear==front){
        int item=arr[front];
        front=-1;
        rear=-1;
        return item;
        }
        else{
        int item=arr[front];
        front+=1;

        return item;
        }
    }
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else{
        for (int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        

        }
        System.out.println();
    }
    }

}
