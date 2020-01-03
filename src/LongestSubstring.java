import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstring
{
    public static void main(String[] args) {
        String s = "abcdecdghijk";
        String r = "";
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                r = r + s.charAt(i);

            } else {
                list.add(r);
                map.clear();
                r = "";
                i = count;
                count = count + 1;
            }
            if (i == s.length() - 1) {
                list.add(r);
            }
        }
        System.out.println(list);
        String s1 = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > s1.length()) {
                s1 = list.get(i);
            }
        }
        System.out.println(s1);
    }
}
