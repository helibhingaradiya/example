public class BinaryTree {
    public static void main(String[] args) {
//        btree btree = new btree();
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//        Node n4 = new Node(40);
//        Node n5 = new Node(50);
//        btree.root = n1;
//        btree.root.left = n2;
//        btree.root.right = n3;
//        btree.root.left.left = n4;
//        btree.root.left.right = n5;
//        inOrder(btree.root);
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
}

class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}

class Btree {
    Node root;
}
