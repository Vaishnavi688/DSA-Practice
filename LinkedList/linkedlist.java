package LinkedList;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);
        if(index == null){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < index-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMiddle(3,4);
        ll.print();
    }
        
}
