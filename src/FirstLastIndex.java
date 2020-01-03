import java.util.*;

public class FirstLastIndex
{
            public static void main(String[] args) {
            String s="abcabdceabcedf";
            Map<Character,List>map=new HashMap<>();
            List<Integer>list=null;
            for(int i=0;i<s.length();i++)
            {
                if(!map.containsKey(s.charAt(i))) {
                    list=new ArrayList<>();
                    list.add(0,i);
                    map.put(s.charAt(i),list);

                }
                else
                {
                    list=map.get(s.charAt(i));

                    if(list.size()==1)
                    {
                        list.add(i);
                    }
                    else if(list.size()==2)
                    {
                        list.set(1,i);
                    }

                }
            }
            System.out.println(map);

        }
    }


