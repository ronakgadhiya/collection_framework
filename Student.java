import java.util.Objects;
public class Student implements Comparable<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name = '" + name + '\'' +
                          ", age = '" + age + '}';
        }

    @Override
    public boolean equals(Object o){
        if (this == o) 
            return true;
        
        if(o== null || getClass() != o.getClass()) return false; 
            Student Student = (Student) o;
            return age == Student.age;

        
    }
    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }

    // @Override
    // public int compareTo(Student that){
    //     return this.name.compareTo(that.name);
    // }
}
