package collection_practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketBalanced {
    public static void main(String[] args) {
        {
            String expr = "([{}]";

            // Function call
            if (checkBalancedBracket(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }
    }

    public static boolean checkBalancedBracket(String expr) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                deque.push(x);
                continue;
            }
            if (deque.isEmpty()) {
                return false;
            }

            char check;
            switch (x) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[')
                        return false;
                        break;

                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[')
                        return false;
                        break;

                case ']':
                    check = deque.pop();
                    if (check == '(' || check == '{')
                        return false;
                        break;
            }
        }
        return (deque.isEmpty());
    }
}
