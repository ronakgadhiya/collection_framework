import java.util.HashSet;
import java.util.Set;

public class Studentset {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("ronak",20));
        students.add(new Student("yash",30));
        students.add(new Student("jaydeep",10));
        
        students.add(new Student("amit",20));


        Student s1 = new Student("ronak",20);
        Student s2 = new Student("ronak",20);
         System.out.println(s1.equals(s2));
        System.out.println(students.toString());
    }
}
