import java.util.ArrayDeque;

public class ArrayDequeexp {
   
    public static void main(String[] args) {
        ArrayDeque<Integer> arraydequev = new ArrayDeque<>();
        arraydequev.offer(23);
        arraydequev.offer(29);
        arraydequev.offer(63);
        arraydequev.offer(78);
        arraydequev.offerFirst(20);
        arraydequev.offerLast(90);
        arraydequev.offer(56);

        System.out.println(arraydequev);

        System.out.println(arraydequev.peek());
        System.out.println(arraydequev.peekFirst());
        System.out.println(arraydequev.peekLast());

        System.out.println(arraydequev.poll());
        System.out.println(arraydequev.pollFirst());
        System.out.println(arraydequev.pollLast());

    }
}
