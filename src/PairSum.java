import java.util.Arrays;

public class PairSum
{
    public static void main(String[] args)
    {
        int[] a={1,5,4,3,6,2,8,7};
        Arrays.sort(a);
        int sum=9;
        int i=0;
        int k=a.length-1;
        while(i<=k)
        {
            if(a[i]+a[k]==sum)
            {
                System.out.println(a[i]+","+a[k]);
                i++;
                k--;
            }
            else if(a[i]+a[k]>sum)
            {
             k--;
            }
            else
            {
                i++;
            }

        }
    }
}
