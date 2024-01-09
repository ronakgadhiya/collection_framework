import java.util.HashMap;
import java.util.Map;

public class mapexp {

  public static void main(String arg[]) {
    Map<String, Integer> numbers = new HashMap<String, Integer>();
    numbers.put("RONAK GADHIYA", 1);
    numbers.put("RONAK PATEL", 2);
    System.out.println(numbers);
    System.out.println(numbers.isEmpty());
    System.out.println(numbers.containsKey("RONAK GADHIYA"));
    System.out.println(numbers.remove("RONAK PATEL"));

    if (!numbers.containsKey("RONAK GADHIYA")) {
      numbers.put("RONAK GADHIYA", 3);
    }
    numbers.putIfAbsent("abhi", 20);
    System.out.println(numbers);

    for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
        System.out.println(entry);

        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }
    for(String key : numbers.keySet()){
        System.out.println(key);
    }
    for(Integer value : numbers.values()){
        System.out.println(value);
    }
  }
}
