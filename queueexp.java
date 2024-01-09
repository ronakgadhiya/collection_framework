import java.util.LinkedList;
import java.util.Queue;

public class queueexp {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(20);
        queue.offer(32);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
