package Warmup_2;

public class stringBits {
    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    //stringBits("Hello") → "Hlo"
    //stringBits("Hi") → "H"
    //stringBits("Heeololeo") → "Hello"

    public String stringBits(String str) {
        String bb="";
        if(str.length()==0) return bb;
        if(str.length()<3) return str.substring(0,1);
        for(int i=0; i<str.length(); i+=2){
            bb = bb+str.charAt(i);
        }
        return bb;
    }
}
