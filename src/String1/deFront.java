package String1;

public class deFront {
    //Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
    // second char if it is 'b'. The string may be any length. Harder than it looks.
    //deFront("Hello") → "llo"
    //deFront("java") → "va"
    //deFront("away") → "aay"

    public String deFront(String str) {
        String aa1 ="";
        String bb1="";
        if(str.length()<2) return str;
        if(str.charAt(0) =='a') aa1 ="a";
        if(str.charAt(1)=='b') bb1 ="b";
        return aa1+bb1+str.substring(2,str.length());
    }
}
