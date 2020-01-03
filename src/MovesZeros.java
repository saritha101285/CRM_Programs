
import java.util.ArrayList;
import java.util.List;

public class MovesZeros
{
    public static void main(String[] args) {
        Integer[] a={0,1,2,0,3,0,0,4};
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
               list.add(a[i]);
            }
        }
        int j=0;
        while(list.size()<a.length)
        {
            list.add(j,0);
            j++;
        }

            System.out.println(list);
    }
}
