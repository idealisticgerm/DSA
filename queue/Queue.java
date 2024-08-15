package queue;

public class Queue {
    int start = -1;
    int end = -1;

    int size = 4;
    int curr_size = 0;

    int[] q = new int[size];

    public void push(int x) {

        if (curr_size == size) {
            System.out.println("Queue is full");
            return;
        }

        if (curr_size == 0) {
            start = 0;
            end = 0;
        }

        else {
            end = (end +1) % size;
        }
        q[end] = x;
        curr_size = curr_size + 1;

    }

    public int pop() {
        int popped = q[start];
        if (curr_size == 0) {
            System.out.println("Queue is empty");
        }

        if (curr_size == 1) {
            start = -1;
            end = -1;
            curr_size = 0;
        } else {
            start = (start +1) % size;
            curr_size = curr_size - 1;
        }
        return popped;

    }

    public int top(){
        return q[start];
    }

public int size(){
    return curr_size;
}

    public void display() {
        int index =start;
        for (int i = 0 ; i <curr_size; i++) {
            System.out.println(q[index]);
            index = (index +1) % size;

            
        }
    }
}
