public class Q876 {
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.insert(7);
        ll.insert(6);
        ll.insert(7);
        ll.insert(5);

        System.out.println("before:");
        ll.printL();
        int val = 7;
        ll.delete(val);
        System.out.println("after:");
//        ll.printL();
//        ll.middlenNode();
        System.out.println();
//        ll.middleNode2();
        ll.printL();

    }


}

class LinkedList1 {
    Node2 head;
    Node2 tail;

    public void printL() {
        if (head == tail) {
            System.out.println("linkedlist empty");
            return;
        }
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insert(int data) {
        Node2 nn = new Node2(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }

    }

    public void middlenNode() {
        int count = 0;
        Node2 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int idx = count / 2;
        count = 0;
        temp = head;
        while (temp != null) {
            count++;
            if (count == idx + 1) {
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
        }
    }

    public void middleNode2() {
        Node2 slow = head;
        Node2 fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = slow.next.next;
            if (fast == null) {
                System.out.println(slow.data);
            }
        }
    }

    public void delete(int val) {
//        Node2 tempNode = head;
//        while (tempNode != null) {
//            if (tempNode.data == val) {
//                Node2 temp = head;
//                while (temp.next.data != val) {
//                    temp = temp.next;
//                }
//                temp.next = temp.next.next;
//            } else{
//                tempNode = tempNode.next;
//
//            }
//
//        }

        Node2 temp = head;
        while (temp != null) {
//            if(temp.next == null){
//                return;
//            }
//            if(temp.data == val){
//              Node2 t2 = temp;
//              temp.next = temp.next.next;
//              t2.next = null;
//            }else{
//                temp = temp.next;
//            }
            if (temp.next == null) {
                return;
            }
            if (head.data == val) {
                Node2 h = head;
                head = head.next;
                h.next = null;
                head.next = temp.next.next;
            } else if (temp.next.data == val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

    }
}

class Node2 {
    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
    }
}
