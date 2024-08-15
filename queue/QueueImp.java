package queue;

public class QueueImp {

    public static void main(String[] args) {
        Queue q = new Queue();

        q.push(5);
        q.push(7);
        q.push(9);
        q.push(11);

        q.display();
        System.out.println("----------------------------------------------------");

        System.out.println("Popped Element: " + q.pop());

        q.display();
        q.push(6);
        System.out.println("----------------------------------------------------");
        q.display();

        System.out.println("Top element: " + q.top());
        System.out.println("Size Of Queue: " + q.size());
    }
}