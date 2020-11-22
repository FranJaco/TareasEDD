package pila1;

import java.util.Stack;

public class Main {

    
    public static void main(String[] args) {
        
        Stack p = new Stack();
        
        p.push(4);
        p.push(1);
        p.push(3);
        p.pop();
        p.push(8);
        p.pop();
        p.push(10);
        p.push(2);
        p.push(5);
        p.push(12);
        p.push(4);
        
        System.out.println(p);
        
    }
    
}
