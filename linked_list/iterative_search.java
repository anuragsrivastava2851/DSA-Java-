package linked_list;

public class iterative_search {
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

    public int iterativeSearch(int key){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // key not found
    }


    public static void main(String[] args) {
        linked_list ll = new linked_list();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addFirst(7);
        ll.addMiddle(5, 2);
        ll.addLast(4);
        ll.print();

        ll.iterativeSearch(5);
        ll.iterativeSearch(10);
      
    }
    
}
