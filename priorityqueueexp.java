import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueueexp {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(65);
        pq.offer(33);
        pq.offer(45);
        pq.offer(2);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        
    }
}