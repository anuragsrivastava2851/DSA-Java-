package Queue;

public class queue_using_linkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{

        Node head=null; // here head is front of queue
        // here tail is rear of queue
        Node tail=null;

        public boolean isEmpty(){
            return head==null && tail==null;
        }

        // add element in queue
        public void add(int data){
            Node newNode = new Node(data);
            if(tail==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        // remove element from queue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            head=head.next;
            if(head==null){
                tail=null;
            }
            return front;
        }

        // peek element from queue
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


    
}
