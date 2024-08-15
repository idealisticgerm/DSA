public class Linkedlist {
    class Node{
        int data;
        Node next;

        // Constructor
        Node(int d){
            data = d;
            next = null;

        }
    }
Node head;

//    Method to insert at the end
public void insert(int data){
//    first create a node to insert it
    Node newnode = new Node(data);
    if(head == null){
        head = newnode;
        return;
    }

    Node last = head;
    while(last.next != null){
        last = last.next;
    }
    last.next = newnode;
}



// Method to print the list
    public void printList(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    }

    public static void main(String[] args) {
Linkedlist list  =new Linkedlist();

list.insert(2);
list.insert(3);
list.insert(5);

list.printList();
    }
}
