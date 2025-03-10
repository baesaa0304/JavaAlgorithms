package Stack_Queue.algorithms02;


import java.io.*;
import java.util.*;

/**
 * 알파벳과 여는 괄호를 넣어줌. 만약 닫는 괄호를 만나는 경우 뺴주면 되는 문제.
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(obj.solution(s));

	}
	String solution(String s) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		for(Character c : s.toCharArray()) {
			stack.push(c);
			if(c.equals(')') && !stack.isEmpty()) {
				while(true) {
					stack.pop();
					if(stack.peek() == '(') {
						stack.pop();
						break;
					}
				}
			}
		}
		for(Character c : stack) {
			answer += c;
		}
		return answer;
	}
	
}
 