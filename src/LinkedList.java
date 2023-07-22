import java.util.Stack;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        LList linkedlist = new LList();
        linkedlist.insert(10);
        linkedlist.insert(20);
        linkedlist.insert(10);
//        linkedlist.insert(40);
        linkedlist.printL();
//        linkedlist.revPrint();
//        linkedlist.printL();
//        linkedlist.find(30);
//        linkedlist.update(10, 100);
//        System.out.println();
//        linkedlist.printL();
//        linkedlist.count();
//        int n = 2;
//        linkedlist.printN(n);
//        linkedlist.printNLast(n);
//        linkedlist.middlenNode();
//        System.out.println("delete:");
//        linkedlist.deleteL(30);
//        linkedlist.printL();
        System.out.println("stack");
        linkedlist.Q234();
        linkedlist.Q83();
        linkedlist.Q27();


    }
}

class LList {
    Node1 head;
    Node1 tail;

    public void insert(int data) {
        Node1 nn = new Node1(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }

    }

    public void printL() {
        if (head == tail) {
            System.out.println("linkedlist empty");
            return;
        }
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void revPrint() {
        if (head == tail) {
            System.out.println("linkedlist empty");
            return;
        }
        Node1 temp = head;
        Stack<Integer> stk = new Stack();
        while (temp == null) {
            stk.push(temp.data);
            temp = temp.next;

        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }
    }

    public void deleteL(int value) {
//        if (head == tail) {
//            System.out.println("linkedlist empty");
//            return;
//        }
//        if (head == tail && head.data == value) {
//            tail = null;
//            head = null;
//        } else
//            if (head.data == value) {
//            Node1 temp = head;
//            head = head.next;
//            temp.next = null;
//        } else if (tail.data == value) {
//            Node1 temp = head;
//            while (temp.next == tail) {
//                temp = temp.next;
//            }
//            temp.next = null;
//            tail = temp;
//        } else {
//            Node1 temp = head;
//            while (temp.next.data != value) {
//                temp = temp.next;
//            }
//            temp.next = temp.next.next;
//        }
        Node1 temp = head;
        while (temp != null) {
            if (head.data == value) {
                Node1 t = temp;
                temp = temp.next;
                head = head.next;
                t.next = null;
            } else if (temp.next == null) {
                return;
            } else if (temp.next.data == value) {
                Node1 n = temp.next;
                n.next = null;
                temp.next = temp.next.next;

            } else if (temp.next.data == value && temp.next.next == null) {
                temp.next = null;
            } else {
                temp = temp.next;
            }
        }
    }

    public void find(int i) {
        Node1 temp = head;
        while (temp != null) {
            if (temp.data == i) {
                System.out.println("present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("not");
    }

    public void update(int ol, int newl) {
        Node1 temp = head;
        while (temp != null) {
            if (temp.data == ol) {
                temp.data = newl;
            }
            temp = temp.next;
        }
        System.out.println("not");

    }

    public void count() {
        int count = 0;
        Node1 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println();
        System.out.println("count is:" + count);
    }

    public void printN(int n) {
        int count = 0;
        Node1 temp = head;
        while (temp != null) {
            count++;

            if (count == n) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void printNLast(int n) {
        int count = 0;
        Node1 temp = head;
        while (temp != null) {
            count++;

            if (count == n) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        temp = head;
        int nth = count - n + 1;
        count = 0;
        while (temp != null) {
            count++;
            if (count == nth) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void middlenNode() {
        int count = 0;
        Node1 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int idx = count / 2;
        count = 0;
        temp = head;
        while (temp != null) {
            if (count == idx) {
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
        }
    }

    public void Q234() {
        Stack<Integer> stk = new Stack<>();
        Node1 t = head;
        while (t != null) {
            stk.push(t.data);
            t = t.next;
        }
        int[] arr = new int[stk.size()];
        int i = 0;
        while (!stk.isEmpty()) {
            arr[i] = stk.pop();
            i++;
        }
        int f = 0;
        int l = arr.length - 1;
        while (f < l) {
            if (arr[f] != arr[l]) {
                System.out.println("false");
                return;
            }
            f++;
            l--;
        }
        System.out.println("true");
//        System.out.println(stk);


    }

    public void Q83() {
        Node1 temp = head;
        while (temp != null) {
            if (temp.data == temp.next.data) {
                Node1 t=temp;
                while (t.data!=t.next.data){
                    t.next=t.next.next;
                }
                temp.next=temp.next.next;
            }
                temp=temp.next;
        }
    }

    public void Q27() {
//        LinkedList<Integer> list=new LinkedList();
        Node1 temp=head;
        Node1 temp1=head;
        while (temp!=null || temp1!=null){
            while (temp!=null){

                temp=temp.next;
            }
            while (temp1!=null){
                temp1=temp1.next;
            }
        }
    }
}

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
    }
}
