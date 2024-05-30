package Warmup_2;

public class doubleX {
    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    //doubleX("axxbb") → true
    //doubleX("axaxax") → false
    //doubleX("xxxxx") → true

    boolean doubleX(String str) {
        int bb= str.indexOf('x');
        if(bb!= str.length()-1 && str.charAt(bb+1)=='x') return true;
        return false;
    }
}
