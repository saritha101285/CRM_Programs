
import java.util.*;

public class FirstNonRepeatative
{
    public static void main(String[] args)
    {
        String s="abcabdedfg";
        firstNonRepeatative(s);
    }
    public static  void firstNonRepeatative(String s)
    {

       /* HashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>() ;
        for(int i=0;i<s.length();i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                }
                else
                {
                    map.put(s.charAt(i), 1);
                }
            }
        for(Map.Entry<Character,Integer> m:map.entrySet())
        {
            if(m.getValue()==1)
            {
                System.out.println(m.getKey());
                break;
            }
        }*/

        List<Character> l=new LinkedList<>();
        List<Character> l1=new LinkedList<>();
        for(int i=0;i<s.length();i++)
        {
            if(l.contains(s.charAt(i)))
            {
                System.out.println(l.indexOf(s.charAt(i)));
                System.out.println(l.get(l.indexOf(s.charAt(i))));
                l.remove(l.get(l.indexOf(s.charAt(i))));

                l1.add(s.charAt(i));
            }
            else
            {
                if(!l1.contains(s.charAt(i)))
                {
                    l.add(s.charAt(i));
                }
            }
        }
    System.out.println(l.get(0));
    }
}
