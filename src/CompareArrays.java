
import java.util.*;
public class CompareArrays
{
    public static void main(String[] args)
    {
        char[] c1={'a','b','c','d','f','e'};
        char[] c2={'e','f','b','c','a','b'};
        boolean flag=true;
        if(c1.length==0 ||c2.length==0 || c1.length!=c2.length)
        {
            {
                System.out.println("Invalid");
                return;
            }
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<c1.length;i++)
        {
            int count=0;
            if(hm.containsKey(c1[i]))
            {
                count=hm.get(c1[i]);
            }
            hm.put(c1[i],++count);
            count=0;
            if(hm.containsKey(c2[i]))
            {
                count=hm.get(c2[i]);
            }
            hm.put(c2[i],--count);
        }
        System.out.println(hm);
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            if(m.getValue()!=0)
            {
                flag=false;
            }
        }
        if(flag)
        {
          System.out.println("Two Char Arrays are same");
        }
        else
        {
            System.out.println("Two arrays are different");
        }
    }
}




