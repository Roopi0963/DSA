package Collections.Queues;


import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

    }
}
