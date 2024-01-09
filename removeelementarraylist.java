import java.util.ArrayList;
import java.util.List;
public class removeelementarraylist {
    public static void main(String arg[]){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        

        System.out.println(list);

        list.remove(0);
        list.remove(Integer.valueOf(60));
        System.out.println(list);
        // list.clear();
        System.out.println(list);

        list.set(0,100000);
        System.out.println(list);

        System.out.println(list.contains(40));
    }
}
