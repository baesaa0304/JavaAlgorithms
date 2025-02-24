package Stack_Queue.algorithms01;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(obj.solution(s));

	}
	String solution(String s) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for(Character c : s.toCharArray()) {
			if(c.equals('(')) stack.add(c);
			else if(c.equals(')')) {
				if (!stack.isEmpty() && stack.peek().equals('(')) stack.pop();
			    else return "NO";
			}
		}
		if(!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}
}
 