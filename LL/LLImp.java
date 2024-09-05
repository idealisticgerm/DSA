package LL;

public class LLImp {

    Node head;
    public Node rethead(){
        return head;
    }

//    Insert at end
    public void insertAtend(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new_node;
        }

//        System.out.println("Node Added Successfully" + "👍");
    }


//    insert at start

    public void insertAtBeg(int data){

        Node new_node  = new Node(data);

        if(head == null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }


//    Remove from start
    public void removeAtBeg(){
        if(head == null){
            System.out.println("LL is empty !");
            return;
        }

        head = head.next;
        System.out.println("Element Deleted !");
    }

//    Remove from end
    public void removeAtend(){
        Node p = head;
        Node q = head.next;

        while(q.next != null){
            q = q.next;
            p = p.next;
        }
        p.next = null;
        System.out.println("Element deleted !");
//        System.out.println(p.data);
    }

    public void display(Node head){
        Node temp = head;
        if(head == null){
            System.out.println("LL is empty !");
            return;
        }

        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
