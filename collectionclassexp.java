import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclassexp {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("ronak", 30));
        list.add(new Student("abhi", 44));
        list.add(new Student("yash", 70));
        list.add(new Student("jaydeep", 40));
        list.add(new Student("amit", 50));

        //  Student s1 = new Student("ravi",20);
        // Student s2 = new Student("raj",20);

        // System.out.println(s1.compareTo(s2));
        System.out.println(list);

        Collections.sort(list,new Comparator<Student>() {
            @Override
            public int compare(Student s1,Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("sorted array for the name : "+list);


        Collections.sort(list);
        System.out.println(list);
        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(5);
        // list.add(78);
        // list.add(5);
        // list.add(14);
        // list.add(22);
        

        // System.out.println(list);
        // System.out.println("Minimum Element  "+Collections.max(list));
        // System.out.println(Collections.frequency(list,5));
        // Collections.sort(list,Comparator.reverseOrder());
        // System.out.println(list);

    }
}
