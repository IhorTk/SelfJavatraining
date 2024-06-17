package Map2;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;


public class wordAppend {
   //Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
    // etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
    //wordAppend(["a", "b", "a"]) → "a"
    //wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
    //wordAppend(["a", "", "a"]) → "a"
   public static void main(String[] args) {
       String[] strings = {"a","b","c","b","a","a","a","b","b","a"};

       System.out.println("wordAppend(strings) = " + wordAppend(strings));

   }
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String sRez="";
        for(int i=0;i<strings.length;i++)
        {
            String s=strings[i];
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
                if (map.get(s)!=1 && map.get(s)%2==0)
                {
                    sRez+=s;
                }
            }
        }
        return sRez;
    }
}
