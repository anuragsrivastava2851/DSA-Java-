package linked_list;

public class pallindrome {
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
    public Node findMiddle(){ 
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        return slow;

}
    public boolean isPallindrome(){
    if(head==null || head.next==null){
        return true;
    }

// step 1: find middle
    Node midNode= findMiddle();

    // step 2: reverse 2nd half
    Node prev=null;
    Node Curr= midNode;
    Node next;

    while(Curr!=null){
    next=Curr.next;
    Curr.next=prev;
    prev=Curr;  
    Curr=next;
    }

    Node right= prev;  // here prev is the head of the reversed 2nd half
    Node left= head;

    // step 3: check left half and right half
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }

    return true;

}


    

    public static void main(String[] args) {
        pallindrome ll = new pallindrome();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(7);
        ll.addMiddle(5, 2);
        ll.addLast(4);
        ll.print();

        System.out.println(ll.isPallindrome());
    }


    
}
