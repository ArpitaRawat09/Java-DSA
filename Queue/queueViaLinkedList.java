package Queue;

public class queueViaLinkedList{
    static class Node {    //Creating a Node 
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Queue {
        Node front;
        int size;

        Queue() {
            this.front = null;
            this.size = 0;
        }

        public void enqueue(int val) {
            Node newElem = new Node(val);
            if (this.front == null) {
                this.front = newElem;
                return;
            }
            Node temp = this.front;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newElem;
        }

        public void dequeue(){
            if(this.front == null){
                System.out.println("Queue is Empty....it's dequeue Operation");
                return;
            }
            front = front.next;
        }

        void printQueue() {

            if (this.front == null) {
                System.out.println("Queue is Empty.....");
                return;
            }
            Node temp = this.front;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue obj = new Queue();

        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.printQueue();

        obj.dequeue();
        obj.printQueue();

    }
}
