import java.util.Stack;

public class stackexp1 {
    public static void main(String arg[]){
        Stack<String> animal = new Stack<>();
        animal.push("kutro");
        animal.push("bilado");
        animal.push("sandh");
        animal.push("khutiyo");
        animal.push("rahil");
        System.out.println(animal);
        animal.pop();
        System.out.println(animal);
        
        System.out.println(animal.peek());
    }
}
