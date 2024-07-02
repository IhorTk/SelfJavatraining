package Logic_2;

public class evenlySpaced {
    //Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values
    // are evenly spaced, so the difference between small and medium is the same as the difference between medium and
    // large.
    //evenlySpaced(2, 4, 6) → true
    //evenlySpaced(4, 6, 2) → true
    //evenlySpaced(4, 6, 3) → false
    public boolean evenlySpaced(int a, int b, int c) {
        if ((a == b && b != c) || (a == c && b != a) || (b == c && c != a)) {
            return false;
        } else if (Math.abs(a - b) == Math.abs(b - c) || Math.abs(a - c) == Math.abs(b - c) || Math.abs(a - c) == Math.abs(b - a)) {
            return true;
        } else {
            return false;
        }
    }
}
