package linkedListProblems;
import Node;
import list;


public class doublyLinkedList {
    public static void main(String[] args) {

        list ob=new list();
        ob.add_at_beginning(50);
        ob.add_at_beginning(505);
        ob.add_at_end(69);
        ob.add_at_specified_pos(666, 3);
        ob.display();
        ob.delete_from_specified_pos(2);
        ob.display();
    }
    
}

class Node{
    int info;
    Node right;
    Node left;
    Node(int value){
        info=value;
        right=null;
        left=null;
    }
}

class list{
        static Node start;
        list(){
            start=null;
        }

        void add_at_beginning(int item){
            Node newNode=new Node(item);
            if (start==null){
                
                start=newNode;
            }
            else{
                newNode.right=start;
                start.left=newNode;
                start=newNode;
            }
        }

        void add_at_end(int item){
            Node newNode=new Node(item);
            if (start==null){                
                start=newNode;
            }
            else{
                Node temp=start;
                while(temp.right!=null){
                    temp=temp.right;
                }

                temp.right=newNode;
            }

        }

        void add_at_specified_pos(int item,int pos){
            Node newNode=new Node(item);
            int i=1;
            Node temp=start;
            while(i<pos-1){
                temp=temp.right;
            }
            newNode.left=temp;
            newNode.right=temp.right.right;
            temp.right=newNode;
        }

        int delete_from_beginning(){
            Node temp=start;
            int item=temp.info;
            temp.left=null;
            start=temp.right;
            
            return item;
            
        }

        int delete_from_end(){
            Node temp=start;
            while(temp.right!=null){
                temp=temp.right;
            }
            int item=temp.info;
            temp.left.right=null;
            return item;
        }


        int delete_from_specified_pos(int pos){
            Node temp=start;
            int i=1;
            while(i<pos){
                temp=temp.right;
                i++;
            }
            int item=temp.info;
            temp.left.right=temp.right;
            temp.right.left=temp.left;
            return item;
        }
        void display(){
            Node temp=start;
            while(temp.right!=null){
                System.out.print(temp.info);
                temp=temp.right;
            }
            System.out.println(temp.info);
        }

}