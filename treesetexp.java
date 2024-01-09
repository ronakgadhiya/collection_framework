import java.util.Set;
import java.util.TreeSet;

public class treesetexp {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(4);        
        ts.add(2);
        ts.add(3);
        System.out.println(ts);

        System.out.println(ts);
        System.out.println(ts.contains(25));
        System.out.println(ts.isEmpty());
        System.out.println(ts.size());
        ts.clear();
        System.out.println(ts.isEmpty());
    }
}
