        public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {0, 1, 3, 4, 7, 8, 9};
        int x =4 ;
        int l = 0, r = a.length - 1;
        int m = (l + r) / 2;
        while (l <= r) {
            if (x == a[m]) {
                System.out.println(x +" found at position " + m);
                break;
            } else if (x < a[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
            m=(l+r)/2;
        }
        if(l>r)
        {
            System.out.println(x+"is not found in the array");
        }
    }
}



