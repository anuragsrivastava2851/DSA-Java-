package linked_list;

public class remove_cycle {
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
    public boolean removeCycle(){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        remove_cycle ll = new remove_cycle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(7);
        ll.addMiddle(5, 2);
        ll.addLast(4);
        ll.print();

        System.out.println(ll.removeCycle ());
    }


    
}
