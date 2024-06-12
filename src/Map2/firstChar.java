package Map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class firstChar {
    //Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
    // seen, with the value of all the strings starting with that character appended together in the order they appear
    // in the array.
    //firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
    //firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
    //firstChar([]) → {}
    public static void main(String[] args) {
        String[] wort = {"abb", "bcc","c","aAA","bCC"};
        System.out.println("Arrays.toString(wort) = " + Arrays.toString(wort));
        System.out.println("firstChar(wort).toString() = " + firstChar(wort).toString());

    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0,1);
            if(map.containsKey(key)) {
                map.put(key, map.get(key)+strings[i]);
            }else{
            map.put(key,strings[i]);
            }
        }
        return map;
    }
}
