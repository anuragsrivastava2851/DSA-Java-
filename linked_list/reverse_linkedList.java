package linked_list;
public class reverse_linkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next= head;
        head= newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addMiddle(int data, int index){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }  
        newNode.next = temp.next;
        temp.next = newNode;     
        
    }

    public void reverse(){
        Node prev= null;
        Node curr= tail= head;
        Node next;

        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;   // head will be previous because at the end current will become null and loop stop and previous will be at the last node which is the new head of the linked list
    }

    

    public static void main(String[] args) {
        reverse_linkedList ll = new reverse_linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(7);
        ll.addMiddle(5, 2);
        ll.addLast(4);
        ll.print();

        ll.reverse();
        ll.print();
    }
    
}
