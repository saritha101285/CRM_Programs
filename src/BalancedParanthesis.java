import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "{([])}";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (st.isEmpty()) {
                System.out.println("false");
                return;
            } else if (s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') {
                char c = st.peek();
                if (c == '(' && s.charAt(i) == ')' || c == '{' && s.charAt(i) == '}' || c == '[' && s.charAt(i) == ']') {
                    st.pop();
                }
            }
        }
        if(st.isEmpty())
        {
            System.out.println("true");
        }
            else
        {
            System.out.println("false");
        }
    }
}