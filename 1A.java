package pila1;

import java.util.Queue;

public class Main {

    
    public static void main(String[] args) {
        
        Queue q = new Queue();
        
        q.enqueue(4);
        q.enqueue(1);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(8);
        q.dequeue();
        q.enqueue(10);
        q.enqueue(2);
        q.penqueue(5);
        q.enqueue(12);
        q.enqueue(4);
        
        System.out.println(q);
        
    }
    
}
