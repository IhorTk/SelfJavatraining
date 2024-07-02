package Logic_2;

public class Blackjack {
    //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they
    // both go over.
    //blackjack(19, 21) → 21
    //blackjack(21, 19) → 21
    //blackjack(19, 22) → 19

    public int blackjack(int a, int b) {
        int bjA=21-a;
        int bjB=21-b;
        if(bjA<0 && bjB<0) return 0;
        if(bjA<0) return b;
        if(bjB<0) return a;

        if(bjA<bjB){
            return a;
        }else{
            return b;
        }
    }
}
