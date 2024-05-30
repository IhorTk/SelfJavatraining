package Array1;

public class front11 {
    //Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
    //front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    //front11([1], [2]) → [1, 2]
    //front11([1, 7], []) → [1]

    public int[] front11(int[] a, int[] b) {
        int[] aa=new int[0];
        int[] bb=new int[1];
        int[] cc=new int[2];
        if(a.length==0 && b.length==0) return aa;

        if(a.length==0){
            bb[0]=b[0];
            return bb;
        }else if(b.length==0){
            bb[0]=a[0];
            return bb;
        }else{
            cc[0]=a[0];
            cc[1]=b[0];
            return cc;
        }
    }
}
