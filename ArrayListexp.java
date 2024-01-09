import java.util.ArrayList;
class ArrayListexp{
    public static void main(String arg[]){
        // String[] studentNames = new String[30];
        // studentNames[0] = "Ronak";
        // studentNames[29] = "Amit";
        // studentNames[30] = "Yash";
        ArrayList<String> Student = new ArrayList<>();
        Student.add("Ronak");
        Student.add("Amit");
        Student.add("Yash");
        System.out.println(Student.toString());
    }
}