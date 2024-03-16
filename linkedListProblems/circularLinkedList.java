package linkedListProblems;
public class circularLinkedList {
    public static void main(String[] args) {
    

        list ob=new list();
        ob.add_at_beginning(30);
        ob.add_at_beginning(40);
        ob.add_at_beginning(88);
        ob.display();
        ob.add_at_end(555);
        ob.display();
        System.out.println(ob.length());
        ob.add_at_specified_pos(93,2);
        ob.display();
        // ob.delete_from_beginning();
        // ob.display();
        ob.delete_from_specified_pos(3);
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
            start.link=start;

        }
        else{
            Node newNode=new Node(n);
            Node temp=start;
            while(temp.link!=start){
                temp=temp.link;
            }
            temp.link=newNode;
            newNode.link=start;
            start=newNode;
        }
    }
    
    void add_at_end(int n){
        if(start==null){
            Node newNode=new Node(n);
            start=newNode;
            start.link=start;
        }
        else{
            Node newNode=new Node(n);
            Node temp=start;
            while(temp.link!=start){
                temp=temp.link;
            }
            temp.link=newNode;
            newNode.link=start;
        }

    }



    void display(){
        if(start==null){
            System.out.println("nothing to print");
        }
        else{
            Node temp=start;
            while(temp.link!=start){
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
            while(temp.link!=start){
                c+=1;
                temp=temp.link;
            }    
        return c+1;
        }
    }


    void add_at_specified_pos(int item,int n){
        if(length()+1<n){
            System.out.println("pos not found");

        }
        else if(n==length()){
            add_at_end(item);

        }
        else if(n==1){
            add_at_beginning(item);
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


    int delete_from_beginning(){
        if(start==null){
            return 0;
        }
        else{
            Node temp=start;
            while(temp!=start){
                temp=temp.link;
            }
            int item=start.info;
            
            start=start.link;
            temp.link=start;

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
            while(temp.link!=start){
                prev=temp;
                temp=temp.link;
            }
            prev.link=start;
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

}

