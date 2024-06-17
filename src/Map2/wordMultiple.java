package Map2;

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    //Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is
    // true if that string appears 2 or more times in the array.
    //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
    //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
    //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "a", "b", "c", "b", "a", "a", "a", "b", "b", "a"};
        System.out.println("wordMultiple(strings) = " + wordMultiple(strings));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}
