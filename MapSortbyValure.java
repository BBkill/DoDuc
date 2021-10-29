import java.util.*;
import java.util.stream.Stream;
//sorted map
public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 101);
        map.put(3, 103);
        map.put(4, 104);
        map.put(6, 106);
        map.put(2, 105);
        Stream<Map.Entry<Integer,Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue()); 
        sorted.forEach(action -> System.out.println(action.getKey()+ " "+ action.getValue()));
    }
}