//class node which make a object..
// create a node

class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

// All operations are perform here
class LinkedList {
  constructor() {
    this.head = null; //insert head = null (List is empty...)
    this.size = 0;
  }
  //   insert data at first node....
  insertAtFirst(val) {
    this.size++;
    const newNode = new Node(val);

    if (this.head == null) {
      this.head = newNode;
      return;
    }
    newNode.next = this.head;
    this.head = newNode;
  }
  //  insert at data last node....
  insertAtLast(val) {
    this.size++;
    let newNode = new Node(val);

    if (this.head == null) {
      this.head = newNode;
      return;
    }

    let temp = this.head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  printLL() {
    // for (let i = 0; i <= this.size; i++) {
    //   process.stdout.write(this.head.val + "->");
    //   this.head = this.head.next;
    // }
    // console.log("null");

    //print data using temp....
    let temp = this.head; //make a temp variable
    if (temp == null) {
      console.log("Empty List...");
      return;
    }
    while (temp != null) {
      process.stdout.write(temp.val + "->");
      temp = temp.next;
    }
    console.log("null");
  }
}

let obj = new LinkedList();
// obj.printLL(); //for printing empty list

obj.insertAtFirst(10);
obj.insertAtFirst(20);
obj.insertAtFirst(30);
obj.insertAtFirst(40);
obj.insertAtFirst(50);
obj.printLL();

obj.insertAtLast(99);
obj.insertAtLast(98);
obj.insertAtLast(97);
obj.printLL();

