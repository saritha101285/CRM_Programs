import java.util.*;

public class MissingNumber
{
    public static void main(String[] args) {
        /*int[] a={1,2,3,4,6,7,8};
        int n=8;
        int temp=0;
        for(int i=1;i<=8;i++)
        {
            if(i==a[temp])
            {
                temp++;
            }
            else
            {
                System.out.println(i);
            }
        }*/
        Integer[] a={1,2,3,4,6,7,8};
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
        for(int i=0;i< Collections.max(list);i++)
        {
          if(!list.contains(i))
          {
              System.out.println(i);
          }
        }
    }
}
