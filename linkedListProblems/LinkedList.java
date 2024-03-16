package linkedListProblems;


public class LinkedList {
    
    public static void main(String[] args) {

        list ob=new list();
        ob.add_at_beginning(30);
        ob.add_at_beginning(40);
        ob.add_at_beginning(88);
        ob.display();
        ob.add_at_end(555);
        ob.display();
        System.out.println(ob.length());
        ob.add_at_specified_pos(93,4);
        ob.display();
        ob.add_after_specified_item(69, 30);
        ob.display();
        // System.out.println(ob.delete_from_beginning());
        // ob.display();
        // System.out.println(ob.delete_from_end());
        ob.display();
        System.out.println(ob.delete_from_specified_pos(4));
        ob.display();
    }
}


class Node{
    public Node link;
    public int info;

    Node(int val){
        info=val;
        link=null;

    }
} 


class list{
    static Node start;
    list(){
        start=null;

        }
    void add_at_beginning(int n){
        if(start==null){
            Node newNode=new Node(n);
            start=newNode;

        }
        else{
            Node newNode=new Node(n);
            Node temp=start;
            start=newNode;
            newNode.link=temp;
        }
    }
    
    void add_at_end(int n){
        if(start==null){
            Node newNode=new Node(n);
            start=newNode;
        }
        else{
            Node newNode=new Node(n);
            Node temp=start;
            while(temp.link!=null){
                temp=temp.link;
            }
            temp.link=newNode;
        }

    }

    void add_at_specified_pos(int item,int n){
        if(length()+1<n){
            System.out.println("pos not found");

        }
        else{
            Node newNode=new Node(item);
            int i=1;
            Node temp=start;
            while(i<n-1){
                temp=temp.link;
                i++;
            }
            Node p=temp.link;
            temp.link=newNode;
            newNode.link=p;
        }

    }

    void add_after_specified_item(int item,int value){
    
        Node newNode=new Node(item);
        Node temp=start;
        while(temp.info!=value){
        
            temp=temp.link;
        }
        Node p=temp.link;
        temp.link=newNode;
        newNode.link=p;


 
    }

    int delete_from_beginning(){
        if(start==null){
            return 0;
        }
        else{
            Node temp=start;

            int item=temp.info;
            start=temp.link;

            return item;
        }
    }

    int delete_from_end(){
        if(start==null){
            return 0;
        }
        else{
            Node temp=start;
            Node prev=null;
            while(temp.link!=null){
                prev=temp;
                temp=temp.link;
            }
            prev.link=null;
            int item=temp.info;

            return item;
        }
    }

    int delete_from_specified_pos(int n){
            if(length()+1<n){
            System.out.println("pos not found");
            return 0;

        }
        else{
            int i=1;
            Node temp=start;
            Node prev=null;
            while(i<n){
                prev=temp;
                temp=temp.link;
                i++;
            }
            int item=temp.info;
            prev.link=temp.link;

            return item;
        }

    }


    void display(){
        if(start==null){
            System.out.println("nothing to print");
        }
        else{
            Node temp=start;
            while(temp.link!=null){
                System.out.print(temp.info+" ");
                temp=temp.link;
            }
            System.out.println(temp.info);
        }
    }

    int length(){
        int c=0;
        if(start==null){
            System.out.println("nothing to print");
            return c;
        }
        else{  
            Node temp=start;
            while(temp.link!=null){
                c+=1;
                temp=temp.link;
            }    
        return c+1;
        }
    }
}
