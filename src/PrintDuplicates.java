import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintDuplicates
{
    public static void main(String[] args) {
        String s="abcabdef";
        List<Character> list=new LinkedList<>();
        for(int i=0;i<s.length();i++)
        {
            if(list.contains(s.charAt(i)))
            {
                System.out.println(s.charAt(i));
            }
            else
            {
                list.add(s.charAt(i));
            }
        }

    }
}
