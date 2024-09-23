// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        System.out.println("Try programiz.pro");
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
while(!pq.isEmpty()){
     System.out.println("peek:"+pq.peek());
     pq.remove();
}
    }
}
