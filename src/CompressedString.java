import java.util.HashMap;

public class CompressedString {
    public static void main(String[] args) {
        String s = "aaabbcccdddaa";
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                System.out.print(s.charAt(i)+""+count);
                count=1;
            }
        }
        System.out.print(s.charAt(s.length()-1)+""+count);
        /*HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 1; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i - 1))) {
                hm.put(s.charAt(i - 1), hm.get(s.charAt(i - 1)) + 1);
            } else {
                hm.put(s.charAt(i - 1), 1);
            }
            int n = i, m = s.length() - 1;
            if (n == m) {
                if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                else
                    hm.put(s.charAt(i),1);

            }
            if (s.charAt(i - 1) != s.charAt(i)) {
                System.out.print(s.charAt(i - 1) + "" + hm.get(s.charAt(i - 1)));
                if(n==m){
                    System.out.print(s.charAt(i) + "" + hm.get(s.charAt(i)));
                }
                hm.clear();
            }
        }*/



    }
}
