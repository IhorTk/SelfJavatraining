package Logic1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;

public class lessBy10 {
    //Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
    //lessBy10(1, 7, 11) → true
    //lessBy10(1, 7, 10) → false
    //lessBy10(11, 1, 7) → true

    public boolean lessBy10(int a, int b, int c) {
        int aa=Math.abs(a-b);
        int bb=Math.abs(a-c);
        int cc=Math.abs(c-b);
        if(aa>=10|| bb>=10||cc>=10) return true;
        return false;
    }
}
