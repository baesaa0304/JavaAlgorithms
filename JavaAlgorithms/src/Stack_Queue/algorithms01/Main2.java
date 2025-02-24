package Stack_Queue.algorithms01;

import java.io.*;
import java.util.*;

public class Main2 {
	public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";  
    }

    public static void main(String[] args) throws IOException {
        Main2 T = new Main2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();  
        System.out.println(T.solution(str));
    }
}
 