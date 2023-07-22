import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree2 {
    //                   1
//               2       3
//           4      5       6
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binaryt {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data+" ");
                if (currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if (currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binaryt tree = new Binaryt();
        Node root = tree.buildTree(nodes);
//        System.out.println(root.data);
        //preorder
        System.out.println("preorder: ");
        preOrder(root);
        //postorder
        System.out.println();
        System.out.println("postorder: ");
        postOrder(root);
        System.out.println();
        System.out.println("inorder: ");
        inOrder(root);
        System.out.println();
        System.out.println("levelOrder: ");
        levelOrder(root);
    }


}
