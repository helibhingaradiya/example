

public class Queue {
    public static void main(String[] args) {
        int front = -1;
        int rear = -1;
        int queue[] = new int[5];

        rear = enqueue(10, rear, queue);
        rear = enqueue(20, rear, queue);
        rear = enqueue(30, rear, queue);
        rear = enqueue(40, rear, queue);
        rear = enqueue(50, rear, queue);

        front = dequeue(front, rear, queue);
        sizeQueue(front,rear);
        IsEmpty(front,rear);
        System.out.println();
        printQueue(queue,front,rear);
    }

    private static void printQueue(int[] queue, int front, int rear) {
        for (int i = front+1; i <= rear; i++) {
            System.out.print(queue[i]+" ");
        };
    }


    private static boolean IsEmpty(int front, int rear) {
        if (front==rear){
            return true;
        }
        return false;
    }

    private static void sizeQueue(int front, int rear) {
        System.out.print("size is:" );
        System.out.print(rear-front);
    }

    private static int dequeue(int front, int rear, int[] queue) {
        if (front == rear) {
            System.out.println("queue is already empty");
            return front;
        }
        front++;
        System.out.println("deleted value is" + queue[front]);
        return front;
    }

    private static int enqueue(int value, int rear, int[] queue) {
        if (rear==queue.length-1){
            System.out.println("queue is full");
            return  rear;
        }
        rear++;
        queue[rear]=value;
        return rear;
    }


}
