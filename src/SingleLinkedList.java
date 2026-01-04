import java.util.LinkedList;

public class SingleLinkedList{
    Node head;


    public void append(int item){
        Node n=new Node(item);
        if(head==null)
        {
            head=n;

        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;

        }

    }
    public void print(){
        if(head==null)
        {
            System.out.println("linked list is empty");

        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.item+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }

    }
    public void insertFirst(int item){
        Node n=new Node(item);
        if(head==null)
        {
            head=n;

        }
        else{
            n.next=head;
            head=n;
        }
    }
    public void insertAtPosition(int position,int item){


        if(head==null)
        {
            insertFirst(item);
            return;
        }



        Node temp=head;
        int index=0;
        while(temp!=null&&index<position-1)
        {
            temp=temp.next;
            index++;
        }
        if(temp==null){
            append(item);
            return;
        }
        Node n=new Node(item);
        n.next=temp.next;
        temp.next=n;
    }
    void deleteItem(int data){
        if(head==null)
        {
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null&&temp.next.item!=data){
            temp=temp.next;
        }
        if(temp.next==null)
        {
            System.out.println("item not found in list");
            return;
        }
        temp.next=temp.next.next;

    }
    void merge(SingleLinkedList singleList){
        if(head==null)
        {
            head=singleList.head;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
         temp=temp.next;
        }
        temp.next=singleList.head;
    }

}