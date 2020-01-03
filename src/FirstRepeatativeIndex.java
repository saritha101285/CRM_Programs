import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatativeIndex
{
    public static void main(String[] args) {
        String s = "abcbda";
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                System.out.println(s.charAt(i)+" "+ map.get(s.charAt(i))+" "+ i);
                break;
            }
            else
            {
                map.put(s.charAt(i),i);
            }
        }
    }
}
