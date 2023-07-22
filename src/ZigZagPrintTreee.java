import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class ZigZagPrintTreee {
//               10
//          20       30
//        40  50   60   70
    public static void main(String[] args) {
        ZigZagPrint zigZagPrint=new ZigZagPrint();
        zigZagPrint.root=new NodeOfZigZag(10);
        zigZagPrint.root.left= new NodeOfZigZag(20);
        zigZagPrint.root.right= new NodeOfZigZag(30);
        zigZagPrint.root.left.left= new NodeOfZigZag(40);
        zigZagPrint.root.left.right= new NodeOfZigZag(50);
        zigZagPrint.root.right.left= new NodeOfZigZag(60);
        zigZagPrint.root.right.right= new NodeOfZigZag(60);
        System.out.println("level order:");
        zigZagPrint.levelOrder();
        System.out.println("ZigZag Print:");
        zigZagPrint.ZigZagP(zigZagPrint.root);

    }
}

class ZigZagPrint{
    NodeOfZigZag root;

    public void levelOrder() {
        Queue<NodeOfZigZag> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
          NodeOfZigZag nodeOfZigZag=queue.poll();
            System.out.print(nodeOfZigZag.data+" ");
            if(nodeOfZigZag.left!=null){
                queue.add(nodeOfZigZag.left);
            }
            if(nodeOfZigZag.right!=null){
                queue.add(nodeOfZigZag.right);
            }
        }
    }

    public void ZigZagP(NodeOfZigZag root) {
        Deque<NodeOfZigZag> deque=new LinkedList<>();
        boolean isrev=false;
        deque.add(root);
        int size=deque.size();
        if (isrev==false){
            while (size!=0){

            }
        }

    }
}

class NodeOfZigZag{
    int data;
    NodeOfZigZag right,left;

    public NodeOfZigZag(int data) {
        this.data = data;
    }
}
