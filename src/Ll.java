public class Ll {
    class Node {
        String data;
        Node next;


        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //add first
    public void addFirst(String data) {
        Node newnode = new Node(data);
        Node head = newnode;
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    //add last
    public void addLast(String data) {
        Node newnode = new Node(data);
        Node head = newnode;
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public static void main(String[] args) {
        Ll list = new Ll();
        list.addFirst("is");
        list.addFirst("a");
    }
}
