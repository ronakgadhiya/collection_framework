import java.util.ArrayList;
import java.util.List;
public class ArrayListexp3{
    public static void main(String[] arg){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(90);

        System.out.println(list2);
        list1.addAll(list2);

        System.out.println(list1);



        System.out.println(list2.get(2));



    }
}