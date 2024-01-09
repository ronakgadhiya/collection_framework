import java.util.Arrays;

public class arrayclassexp {
    public static void main(String[] args) {
        // int a[] = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
        // int index = Arrays.binarySearch(a,5);
        // System.out.println(index);
        Integer[] number = {10,2,32,55,12,1,5,0,100,-5};
        Arrays.sort(number);
        Arrays.fill(number,22);

        for(int i:number){
            System.out.println(i);
        }
    }
}
