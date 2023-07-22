import java.util.LinkedList;
import java.util.Queue;
public class BT2 {
    public static void main(String[] args) {
        Btree1 btree=new Btree1();
        btree.root=new NNode2(10);
        btree.root.left= new NNode2(20);
        btree.root.right= new NNode2(30);
        btree.root.left.left= new NNode2(40);
        btree.root.left.right= new NNode2(50);
        btree.root.right.left= new NNode2(60);
        btree.root.right.right= new NNode2(60);
        System.out.println("levelorder");
        btree.levelorder( );
        System.out.println();
        System.out.println("inorder");
        btree.inorder(btree.root);
        System.out.println();
        System.out.println("preorder");
        btree.preorder(btree.root);
        System.out.println();
        System.out.println("postorder");
        btree.postorder(btree.root);
        System.out.println();

    }

}
class Btree1{
    NNode2 root;

    public void levelorder() {
        Queue<NNode2> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            NNode2 node=queue.poll();
            System.out.print(node.data+" ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    public void inorder(NNode2 root) {
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public void preorder(NNode2 root) {
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }

    public void postorder(NNode2 root) {
        if (root==null){
            return;
        }

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");

    }
}
class NNode2{
    int data;
    NNode2 left;
    NNode2 right;

    public NNode2(int data) {
        this.data = data;
    }
}