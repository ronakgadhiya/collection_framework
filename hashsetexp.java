import java.util.HashSet;
import java.util.Set;

public class hashsetexp {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(25);
        set.add(105);
        set.add(22);
        set.add(52);
        System.out.println(set);
        set.remove(105);
        System.out.println(set);
        System.out.println(set.contains(25));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());


    }
}
