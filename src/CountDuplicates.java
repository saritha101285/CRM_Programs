import java.util.HashMap;
import java.util.Map;

public class CountDuplicates
{
    public static void main(String[] args)
    {
       /* int[]  a={1,2,3,2,4,4,4,3,3,0};
        int count=0;
        System.out.println(countDuplicate(a,count));
    }
    public static int countDuplicate(int[] a,int count)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
            else
            {
             hm.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()>1)
            {
                count++;
            }
        }
        return count;*/

       String s="abcabdeef";
       int count=0;
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           if(hm.containsKey(s.charAt(i)))
           {
               hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
           }
           else
           {
               hm.put(s.charAt(i),1);
           }
       }
       for(Map.Entry<Character,Integer> m:hm.entrySet())
       {
           if(m.getValue()==2)
           {
               count++;
           }
       }
       System.out.println(count);
    }
}
