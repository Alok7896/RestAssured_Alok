package JavaProgramming;

public class LL{
    Node head=null;
    Node tail=null;
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public void addLast(int val){
            Node n=new Node(val);
            if (head==null){
                head=n;
                this.val=val;
                next=null;
            }
        }
    }
}