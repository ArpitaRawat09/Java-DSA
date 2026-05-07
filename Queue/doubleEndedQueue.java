
public class doubleEndedQueue {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;
        int size;

        Queue() {
            this.front = null;
            this.rear = null;
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

        void insertAtFirst(int val) {
            this.size++;

            Node newElem = new Node(val);

            if (this.front == null) {
                this.front = newElem;
                return;
            }
            newElem.next = this.front;
            this.front = newElem;

        }

        void deleteAtLast() {
            if (this.front == null) {
                System.out.println("Empty Queue -----");
                return;
            }

            if (this.front.next == null) {
                this.front = null;
                return;
            }

            Node temp = this.front;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        void printQueue() {
            if (this.front == null) {
                System.out.println("Empty Queue-------");
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

        // obj.enqueue(10);
        // obj.enqueue(20);
        // obj.enqueue(30);
        // obj.enqueue(40);
        // obj.enqueue(50);
        // obj.printQueue();

        System.out.println("Insert At First --------");
        obj.insertAtFirst(100);
        obj.insertAtFirst(200);
        obj.insertAtFirst(300);
        obj.insertAtFirst(400);
        obj.insertAtFirst(500);
        obj.printQueue();


        System.out.println("Delete At Last-------");
        obj.deleteAtLast();
        obj.printQueue();

    }
}
