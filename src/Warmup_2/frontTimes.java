package Warmup_2;

public class frontTimes {
//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever
//    is there if the string is less than length 3. Return n copies of the front;
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"
public String frontTimes(String str, int n) {
    String bb ="";
    if(str.length() < 3){
        for(int i=0; i<n;i++){
            bb= bb+str;
        }
    }else{
        for(int i=0; i<n;i++){
            bb= bb+str.substring(0,3);
        }
    }
    return bb;
}
}
