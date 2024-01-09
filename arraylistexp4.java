import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class arraylistexp4 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(1);
    list1.add(2);
    list1.add(2);
    System.out.println(list1);

    for (int i = 0; i < list1.size(); i++) {
      System.out.println(list1.get(i));
    }
    for (Integer i : list1) {
      System.out.println(i);
    }

    Iterator<Integer> it = list1.iterator();

    while (it.hasNext()) {
      System.out.println("Iterator" + it.next());
    }
  }
}
