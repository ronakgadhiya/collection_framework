import java.util.ArrayList;
import java.util.List;
public class ArrayListexp2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Integer.valueOf(20));
        list.add(Integer.valueOf(30));
        list.add(Integer.valueOf(40));
        System.out.println(list);
        list.remove(Integer.valueOf(10));
        System.out.println(list);
        list.add(0, 10);
        System.out.println(list);


        //newlist of arraylist

    List<Integer> newlist = new ArrayList<>();
    newlist.add(110);
    newlist.add(120);


    list.addAll(newlist);

    System.out.println(list);




    }

}
