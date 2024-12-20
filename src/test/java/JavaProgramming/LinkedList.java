package JavaProgramming;

public class LinkedList {
    Node head=null;
    Node tail=null;
    int size;

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }

    }

    public void addLast(int val){
        Node n=new Node(val);
        if (head==null){
            head=tail=n;
        }
        else {
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void addFirst(int val){
        Node n=new Node(val);
        if (head!=null){
            n.next=head;
            head=n;
        }
        else {
            head=tail=n;
        }
    }
    public void Display(){
        Node temp=head;
        while (temp.next!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.addLast(1);
        ll1.addLast(2);
        ll1.addLast(3);
        ll1.addLast(4);
        ll1.addFirst(5);
        ll1.Display();

    }
}




