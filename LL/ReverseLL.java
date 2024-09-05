package LL;
public class ReverseLL {
public static Node reverse(Node head){
Node prev = null;
Node curr = head;
while(curr != null){
    Node forward = curr.next;
    curr.next = prev;
    prev = curr;
    curr = forward;
}
return prev;
}
    public static void main(String[] args) {
        LLImp ll = new LLImp();
        ll.insertAtend(8);
        ll.insertAtend(10);
        ll.insertAtend(12);
        ll.insertAtend(14);
        ll.insertAtend(16);
        ll.insertAtend(20);
        Node head =  ll.rethead();
        System.out.println(head.data);
        ll.display(head);
        System.out.println();
        Node curr = reverse(head);
        ll.display(curr);


    }
}
