package String1;

public class withoutX2 {
    //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
    // return the string unchanged. This is a little harder than it looks.
    //withoutX2("xHi") → "Hi"
    //withoutX2("Hxi") → "Hi"
    //withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {
        if(str.length()>1 && str.substring(0,2).equals("xx")) return str.substring(2);
        if(str.length()>0 && str.charAt(0)=='x') str = " " + str.substring(1);
        if(str.length()>1 && str.charAt(1)=='x') str = str.substring(0,1)+ str.substring(2);
        return str.trim();
    }
}
