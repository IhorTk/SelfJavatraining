package Logic_2;

public class makeChocolate {
    //We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    // Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if
    // it can't be done.
    //makeChocolate(4, 1, 9) → 4
    //makeChocolate(4, 1, 10) → -1
    //makeChocolate(4, 1, 7) → 2
    public int makeChocolate(int small, int big, int goal) {
        if(goal- countBig(big, goal) < small){
            return goal-countBig(big, goal);
        } else if (goal-countBig(big, goal) == small) {
            return small;
        }else{
            return -1;
        }
    }

    public int countBig(int big, int goal){
        int count=0;
        for (int i = 0; i <= big; i++) {
            if((goal-i*5)<5){
                count=i*5;
                break;
            }else{
                count=i*5;
            }
        }
        return count;
    }
}

