package Array1;

public class plusTwo {
    //Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
    //plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
    //plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
    //plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    public int[] plusTwo(int[] a, int[] b) {
        int[] bb=new int[4];
        bb[0]=a[0];
        bb[1]=a[1];
        bb[2]=b[0];
        bb[3]=b[1];
        return bb;
    }
}
